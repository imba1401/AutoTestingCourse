package src.day7;

import java.util.Random;

public class Player {

    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    static int countPlayers;

    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(2) + 9; //для удобства проверки я уменьшила с 90 до 9
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run(Player z) {
        if (stamina == 0) {
           return;
        }
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }

    }

    public static void info() {
        if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else if (countPlayers < 5) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else if (countPlayers == 5) {
            System.out.println("Команды неполные. На поле еще есть 1 свободное место");
        }
    }
}