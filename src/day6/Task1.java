package src.day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motorbike bike = new Motorbike(1989, "black", "Harley-Davidson FXR Low Rider");
        car1.info();
        car1.setYear(2010);
        System.out.println(car1.yearDifference(2020));
        bike.info();
        System.out.println(bike.yearDifference(2020));


    }
}
