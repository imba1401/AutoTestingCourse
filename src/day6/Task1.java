package src.day6;
/*1. Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня
в пакет текущего дня.

В классах Автомобиль и Мотоцикл реализовать два метода:
info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
yearDifference() - принимает на вход число (год), и возвращает разницу между
переданным годом и годом выпуска транспортного средства*/

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motorbike bike = new Motorbike(1989, "black", "Harley-Davidson FXR Low Rider");

        car1.info();
        car1.setYear(2010);
        System.out.println(car1.yearDifference(2020));

        bike.info();
        System.out.println(bike.yearDifference(1950));


    }
}
