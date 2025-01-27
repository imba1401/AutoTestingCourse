package src.day9;

public class Student extends Human{
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
        super.printInfo();
    }
}
