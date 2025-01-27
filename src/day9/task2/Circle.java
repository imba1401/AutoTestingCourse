package src.day9.task2;

public class Circle extends Figure {

    private double theRadiusOfTheCircle;

    public Circle(double theRadiusOfTheCircle, String color) {
        super(color);
        this.theRadiusOfTheCircle = theRadiusOfTheCircle;
    }


    @Override
    public double area() {
        return Math.PI * Math.pow(theRadiusOfTheCircle, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * theRadiusOfTheCircle;
    }
}
