package src.day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    private String estimation;

    public void evaluate(String studentName) {
        /*final int min = 2;
        int max = 5;
        max -= min;
        int number = (int) ((Math.random() * ++max) + min);*/
        Random random = new Random();
        int number = random.nextInt(4)+2; //надо от 2 до 5. Поставим bound 4 и будет считаться как 0,1,2,3 и прибавляем 2, получаем 2,3,4,5

        switch (number) {
            case 2:
                estimation = "неудовлетворительно";
                break;
            case 3:
                estimation = "удовлетворительно";
                break;
            case 4:
                estimation = "хорошо";
                break;
            case 5:
                estimation = "отлично";
                break;
        }
        System.out.println("“Преподаватель " + name + " оценил студента с именем " + studentName +
                " по предмету " + object + " на оценку " + "“" + estimation + "“");

    }
}
