package src.day15;
/*
Вам дан файл с информацией об остатках обуви на складе
(src/main/resources/shoes.csv). Это пример реальной выгрузки остатков из 1С в csv файл
(формат файла с разделителями, в качестве разделителя использован символ ";").
В этом файле содержится информация о названии модели обуви, ее размер и оставшееся на складе
количество.
До преобразования в csv это была таблица с тремя колонками:
Название  Размер Кол-во
Ботинки HS РАН-Р 400 чер. ЗП;45;4
Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.;37;1
Ботинки СВАРЩИК ут М. 1398 3П;40;0
Ботинки СВАРЩИК ут М. 1398 ЗП;45;0
Ботинки ТОФФ БЕРКуТ и с выс. берцами ут ч; 38;0

Необходимо сформировать новый файл
(src/main/resources/missing_shoes. txt) с информацией о моделях и размерах обуви,
которой нет на складе (количество = 0).
Для этого реализуйте программу, которая принимает на вход csv файл и
создает новый txt файл следующего содержания (должно получиться 3 строки):
Ботинки СВАРЩИК ут М. 1398 3П, 40, 0
Ботинки СВАРЩИК ут М. 1398 ЗП, 45, 0
Ботинки ТОФФ БЕРКуТ и с выс. берцами ут ч, 38, 0
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/shoes.csv");
        Scanner scanner = new Scanner(file);

        File fileOut = new File("src/main/resources/missing_shoes.txt");
        PrintWriter pw = new PrintWriter(fileOut);

        while (scanner.hasNextLine()) {
            String[] shoes = scanner.nextLine().split(";");
            if (Integer.parseInt(shoes[2]) == 0)
                pw.println(shoes[0] + ", " + shoes[1] + ", " + shoes[2]);

        }
        pw.close();
        scanner.close();
    }
}