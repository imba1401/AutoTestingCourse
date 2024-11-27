package src.day4;
/*Задачи:
        1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
        указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
        содержимое массива в консоль, а также вывести в консоль информацию о:
     +   а) Длине массива
        б) Количестве чисел больше 8
        в) Количестве чисел равных 1
        г) Количестве четных чисел
        д) Количестве нечетных чисел
       + е) Сумме всех элементов массива

        Пример:
        Введено число 10. Сгенерирован следующий массив:
        [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
        Информация о массиве:
        Длина массива: 10

        Количество чисел больше 8: 1
        Количество чисел равных 1: 0
        Количество четных чисел: 6
        Количество нечетных чисел: 4
        Сумма всех элементов массива: 46*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + ",");
        }
        System.out.print("] ");

        System.out.println("\nИнформация о массиве:");
        System.out.println("Длина массива: " + array.length);


        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 8) {
                count++;}
        }
        System.out.println("Количество чисел больше 8: " + count);

        int count2 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] ==1) {
                count2++;}
        }
        System.out.println("Количество чисел равное 1: " + count2);

        int count3 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                count3++;}
        }
        System.out.println("Количество четных чисел: " + count3);

        int count4 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0) {
                count4++;}
        }
        System.out.println("Количество нечетных чисел: " + count4);

        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Сумма всех элементов массива " + sum);



    }
}

