package src.day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("DeLorean");
        car1.setYear(1985);
        car1.setColor("silver");
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println(car1.getColor());
      //  System.out.println(car1.getModel() + " " + car1.getYear() + " " + car1.getColor());


    }
}
