package src.day12;
/**Создать список строк, добавить в него 5 марок автомобилей, вывести список в
консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
из списка. Распечатать список.*/

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Porshe");
        cars.add("Mersedes");
        cars.add("Ferrary");
        cars.add("Tesla");
        cars.add("Toyota");
        System.out.println(cars);

        cars.add(3,  "Bently");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);
    }
}
