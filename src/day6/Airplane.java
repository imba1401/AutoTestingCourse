package src.day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;


    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public void info() {
        System.out.println("“Изготовитель: " + producer + ", год выпуска: " + year
                + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel + "“");
    }

    public int fillUp (int addFillUp) {
      fuel += addFillUp;
      return fuel;
    }
}
