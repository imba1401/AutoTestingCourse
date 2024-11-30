package src.day4;
/*Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
        матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
        В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
        строк несколько, вывести индекс последней из них.
        Пример сгенерированной матрицы (для простоты m=3, n=5):
        3 2 1 5 7 // сумма - 18
        1 2 5 6 2 // сумма - 16
        3 4 9 6 4 // сумма - 26
        Ответ: 2 (индекс строки, сумма чисел в которой максимальна)*/


import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        int[][] array = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
       //         System.out.print(array[i][j] + " "); // вывод строки
            }
       //     System.out.println(); // вывод столбцов
        }


        int maxNumberString = 0;
        int IndexMaxString = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
       //     System.out.println(sum);

            if (sum >= maxNumberString){
                maxNumberString = sum;
                IndexMaxString = i;

            }
        }
     //   System.out.println("max" + maxNumberString);
        System.out.println("max строчка с индексом " + IndexMaxString);
    }
}