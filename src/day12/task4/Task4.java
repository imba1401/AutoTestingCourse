package src.day12.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. *Выполнять в подпапке task4 в day12*
 * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
 * группу можно было добавлять и удалять участников. Под участником понимается
 * строка (String) с именем и фамилией. Реализовать статический метод слияния групп
 * (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название
 * метода: transferMembers. Этот метод принимает в качестве аргументов два
 * экземпляра класса MusicBand. Реализовать метод printMembers (в классе
 * MusicBand), выводящий список участников в консоль. Проверить состав групп после
 * слияния.
 */

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Фредди Меркьюри");
        members1.add("Джон Дикон");
        members1.add("Роджер Тейлор");
        members1.add("Брайан Мэй");
        MusicBand band1 = new MusicBand("The Queen", 1970, members1);


        List<String> members2 = new ArrayList<>();
        members2.add("Джон Леннон");
        members2.add("Пол Маккартни");
        members2.add("Джордж Харрисон");
        members2.add("Ринго Старр");
        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();

    }
}