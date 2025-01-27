package src.day9.task2;

public class Rectangle extends Figure {
    private double width, length;

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
}
