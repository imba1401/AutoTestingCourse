package src.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file1 = new File("FileFor14Day.txt");
        System.out.println(Task1.printSumDigits(file1));
    }

    public static String printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            if (numbers.length != 7) {
                throw new IllegalArgumentException();
            }
            double sum = 0;
            for (String number : numbers) {
                sum += Double.parseDouble(number);
            }

            double average = sum / (double) numbers.length;
            DecimalFormat myFormat = new DecimalFormat("#.###");

            scanner.close();
            return average + " --> " + myFormat.format(average);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
