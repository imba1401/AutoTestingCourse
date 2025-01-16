package src.day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane arobus = new Airplane("British Airlines", 325, 350, 6483);
        arobus.setYear(2024);
        arobus.setLength(315);
        System.out.println(arobus.fillUp(300));
        System.out.println (arobus.fillUp(700));
        arobus.info();
    }
}
