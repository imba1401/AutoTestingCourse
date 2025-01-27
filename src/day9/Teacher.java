package src.day9;

public class Teacher extends Human{
    private String object;

    public Teacher(String name, String object) {
        super(name);
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public void printInfo(){  //(должно выводиться именно две строки - необходимо использовать ключевое слово super)
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + name);
    }
}
