package src;

public class Day1 {
    public static void main (String[] args) {
        System.out.println("\nЗадание 1");
        int counter = 0;
        while (counter < 10) {
            System.out.print("JAVA ");
            counter++;
        }

        System.out.println("\n\nСледующее задание 2");

        for (int i = 0; i < 10; i++) {
            System.out.print("JAVA ");
        }

        System.out.println("\n\nСледующее задание 3");

        for (int i = 1; i < 11; i++) {
            System.out.println("JAVA ");
        }

        System.out.println("\n\nСледующее задание 4");

        int year = 1980;
        while (year < 2021) {
            System.out.println("Олимпиада " + year + " года");
            year = year + 4;
        }

        System.out.println("\nСледующее задание 5");

        for (int i = 1980; i < 2021; i= i+4) {
                System.out.println("Олимпиада " + i + " года");
            }


        System.out.println("\nСледующее задание 6");

        int k = 5;
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * " + k + " = " + k * i);
        }

    }
}
