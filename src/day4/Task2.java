package src.day4;

/*
2. Создать новый массив размера 100 и заполнить его случайными числами из
        диапазона от 0 до 10000.
        Затем, используя циклы for each вывести:
        - наибольший элемент массива
        - наименьший элемент массива
        - количество элементов массива, оканчивающихся на 0
        - сумму элементов массива, оканчивающихся на 0
        Использовать сортировку запрещено.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int maxnumber = 0;
        for (int i : array) {
            if (i > maxnumber) {
                maxnumber = i;
            }
        }
        System.out.println("Наибольший элемент массива " + maxnumber);

        // мой вариант:
        int minnumber = array[1];
        for (int i : array) {
            if (minnumber > i) {
                minnumber = i;
            }
        }
        System.out.println("Наименьший элемент массива " + minnumber);

       /* // второй вариант
        int minnumber2 = 100000;
        for (int i : array) {
            if (i < minnumber2) {
                minnumber2 = i;
            }
        }
        System.out.println("Наименьший элемент массива " + minnumber2);*/


            int count = 0;
            for (int i : array) {
                if (i % 10 == 0) {
                    count++;
                }
            }

            System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);


            int sum = 0;
            for (int i : array) {
                if (i % 10 == 0) {
                    sum += i;
                }
            }
            System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sum);


    }

}




