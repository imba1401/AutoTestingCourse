package src.day8;
/*1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна
строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
(0 + “ “ + 1 + “ “ + 2 + ... + 20000).
После создания такой строки, вызов System.out.println() на этой строке должен
вывести в консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 ... 19995 19996 19997 19998 19999 20000
Для того, чтобы почувствовать разницу в производительности между конкатенацией
обычных строк (класс String) и использовании StringBuilder, реализуйте
описанную задачу этими двумя способами, замеряя время работы программы.*/

public class Task1 {
    public static void main(String[] args) {

        long before = System.currentTimeMillis(); //сделала через замер currentTimeMillis
        long time = System.nanoTime(); // решила проверить метод nanoTime
        String string = "";
        for (int i = 0; i < 20001; i++) {
            string += i + " ";
        }
        System.out.println(string);
        long after = System.currentTimeMillis();
        time = System.nanoTime() - time;


        // второй способ с помощью StringBuilder

        long before1 = System.currentTimeMillis();
        long time2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20001; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());

        long after1 = System.currentTimeMillis();
        time2 = System.nanoTime() - time2;

        System.out.println("Время String = " + (after - before));
        System.out.println("Время StringBuilder = " + (after1 - before1));

        System.out.printf("Время String nanoTime %,9.3f ms\n", time / 1_000_000.0);
        System.out.printf("Время StringBuilder nanoTime %,9.3f ms\n", time2 / 1_000_000.0);
    }
}
