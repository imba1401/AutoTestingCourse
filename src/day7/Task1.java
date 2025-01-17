package src.day7;
/*1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
        дня.
        В классе Самолет создать статический метод compareAirplanes, который в
        качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
        сообщение в консоль о том, какой из самолетов длиннее.*/

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("British Airlines", 1990, 880, 6483);
        Airplane a2 = new Airplane("British Airlines", 2000, 1000, 6483);
        Airplane.compareAirplanes(a1,a2);
    }
}
