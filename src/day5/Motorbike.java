package src.day5;

public class Motorbike {
    private int year;
    private String color;
    private String Model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        Model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return Model;
    }
}
