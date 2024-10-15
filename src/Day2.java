package src;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // задание 1
        System.out.println("Задание 1");

        int a = scanner.nextInt();
        if (a >= 1 && a <= 4) {
            System.out.println("Малоэтажный дом \n");
        } else if (a > 4 && a < 9) {
            System.out.println("Среднеэтажный дом\n");
        } else if (a >= 9) {
            System.out.println("Многоэтажный дом\n");
        } else {
            System.out.println("Ошибка ввода\n");
        }

        // задание 2
        System.out.println("Следующее задание 2");
        int d = scanner.nextInt();
        int b = scanner.nextInt();

        if (d >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int c = d + 1; c < b; c++) {
                if (c % 5 == 0 && c % 10 != 0) { // оператор целочисленного деления
                    System.out.print(c + " ");
                }
            }
        }


        // задание 3
        System.out.println("\nСледующее задание 3");
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int u = y + 1;
        while (u < z) {
            if (u % 5 == 0 && u % 10 != 0) {
                System.out.print(u + " ");
            }
            u++;
        }
        while (y >= z) {
            System.out.println("Некорректный ввод");
            break;
        }

        // задание 4
        System.out.println("\nСледующее задание 4");

        double w = scanner.nextDouble();
        double q;

        if (w >= 5) {
            q = ((w * w) - 10) / (w + 7);
            System.out.println(q);
        } else if (-3 < w && w < 5) {
            q = (w + 3) * ((w * w) - 2); // либо можно использовать Math.pow (w,2)
            System.out.println(q);
        } else {
            System.out.println("420");
        }
    }
}








