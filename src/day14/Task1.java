package src.day14;
/*Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
Заполнить его вручную десятью произвольными числами. Реализовать статический
метод printSumDigits(File file), который считает сумму всех чисел в этом
файле и выводит ее на экран. Вызвать данный метод в методе main().
Если файла не существует в папке проекта, в программе необходимо выбрасывать
исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если
чисел в файле меньше или больше 10, необходимо выбрасывать исключение и
выводить в консоль сообщение “Некорректный входной файл”.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("FileFor14Day.txt");
        System.out.println(Task1.printSumDigits(file));
    }

    public static int printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" "); //получаем значения между пробелами
            if (numbers.length != 10) {
                throw new IllegalArgumentException();
            }
            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            System.out.println(Arrays.toString(numbers));
            scanner.close();
            return sum;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return 0;
    }
}


