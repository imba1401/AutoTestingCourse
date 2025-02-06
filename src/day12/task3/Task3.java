package src.day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Выполнять в подпапке task3 в day12*
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
 * (название музыкальной группы и год основания). Создать 10 или более экземпляров
 * класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
 * которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
 * список. Создать статический метод в классе Task4:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand>
 * bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 * состоящий из групп, основанных после 2000 года. Вызвать метод
 * groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
 * из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
 * после 2000 года).
 */

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();

        MusicBand m1 = new MusicBand("The Rolling Stones", 1962);
        MusicBand m2 = new MusicBand("The Queen", 1970);
        MusicBand m3 = new MusicBand("Aerosmith", 1970);
        MusicBand m4 = new MusicBand("The Beatles", 1960);
        MusicBand m5 = new MusicBand("AC/DC", 1973);
        MusicBand m6 = new MusicBand("Red Hot Chili Peppers", 1983);
        MusicBand m7 = new MusicBand("Coldplay", 1997);
        MusicBand m8 = new MusicBand("Imagine Dragons", 2008);
        MusicBand m9 = new MusicBand("Би-2", 1988);
        MusicBand m10 = new MusicBand("Lumen", 1998);

        musicBands.add(m1);
        musicBands.add(m2);
        musicBands.add(m3);
        musicBands.add(m4);
        musicBands.add(m5);
        musicBands.add(m6);
        musicBands.add(m7);
        musicBands.add(m8);
        musicBands.add(m9);
        musicBands.add(m10);

        for (MusicBand m : musicBands) {
            System.out.println(m);
        }

        Collections.shuffle(musicBands);
        System.out.println();

        for (MusicBand m : musicBands) {
            System.out.println(m);
        }

        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();

        for (MusicBand m : musicBands) {
            if (m.getYear() > 2000)
                musicBandsAfter2000.add(m);
        }
        System.out.println("Группы после 2000" + musicBandsAfter2000);


    }
}
