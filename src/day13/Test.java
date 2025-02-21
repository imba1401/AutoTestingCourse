package src.day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Rose");
        User user2 = new User("Jack");
        User user3 = new User("Din");

        user1.sendMessage(user2, "Привет, Jack");
        user1.sendMessage(user2, "Как день прошел?");

        user2.sendMessage(user1, "Привет, Rose");
        user2.sendMessage(user1, "На работе завал");
        user2.sendMessage(user1, "А у тебя как?");

        user3.sendMessage(user1, "Привет, Rose");
        user3.sendMessage(user1, "Как прошли выходные?");
        user3.sendMessage(user1, "Тебе удалось доделать свой курс?");

        user1.sendMessage(user3, "Привет, Din");
        user1.sendMessage(user3, "Нет, не получилось, было много дел");
        user1.sendMessage(user3, "А как твое заявление на отпуск, одобрили?");

        user3.sendMessage(user1, "Да, поеду в июле, как запланировал");
        user3.sendMessage(user1, "Наконец-то хоть отдохну");
        user3.sendMessage(user1, "Море, песочек и хорошая книга, и много много плавания");

        MessageDatabase.showDialog(user1, user3);
       // System.out.println(MessageDatabase.getMessages()); (проверка вывода списка)

    }
}
