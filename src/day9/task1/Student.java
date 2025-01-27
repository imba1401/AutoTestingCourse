package src.day9.task1;

import src.day9.task1.Human;

public class Student extends Human {
    private String studentsGroupName;

    public Student(String name, String studentsGroupName) {
        super(name);
        this.studentsGroupName = studentsGroupName;
    }

    public String getStudentsGroupName() {
        return studentsGroupName;
    }

    public void setStudentsGroupName(String studentsGroupName) {
        this.studentsGroupName = studentsGroupName;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}
