package src.day9.task2;

public class Triangle extends Figure {
    private double lengthTriangle1;
    private double lengthTriangle2;
    private double lengthTriangle3;

    public Triangle(int lengthTriangle1, int lengthTriangle2, int lengthTriangle3, String color) {
        super(color);
        this.lengthTriangle1 = lengthTriangle1;
        this.lengthTriangle2 = lengthTriangle2;
        this.lengthTriangle3 = lengthTriangle3;
    }

    @Override
    public double area() {
         return (lengthTriangle1 * lengthTriangle2) /2;
       // double half = perimeter() / 2; // это вариант по формуле Гирона
       // return Math.sqrt(half * (half - lengthTriangle1) * (half - lengthTriangle2) * (half - lengthTriangle3));

    }

    @Override
    public double perimeter() {
        return lengthTriangle1 + lengthTriangle2 + lengthTriangle3;
    }
}
