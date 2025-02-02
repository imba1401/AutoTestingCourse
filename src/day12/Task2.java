package src.day12;
/**
 * Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
 * Вывести список.
 */

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                number.add(i);
            }
        }
        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0) {
                number.add(i);
            }
        }
        System.out.println(number);
    }
}
