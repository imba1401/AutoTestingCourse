package src.day6;

public class Task3 {
    public static void main(String[] args) {
        Student student1 = new Student("Mike");
        Teacher teacher1 = new Teacher("Новицки", "Математика");
        teacher1.evaluate(student1.studentName);

    }
}
