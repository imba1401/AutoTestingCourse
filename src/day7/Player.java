package src.day7;

public class Player {

    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    static int countPlayers;

    public Player() {
        final int min = 9; //для удобства проверки я уменьшила с 90 до 9
        int max = 10; //для удобства проверки я уменьшила с 10 до 9
        max -= min;
        this.stamina = (int) ((Math.random() * ++max) + min);
        countPlayers++;
        if (countPlayers > 6) {
            countPlayers = 6;
        }
    }

    public int getStamina() {

        return stamina;
    }

    public void run(Player z) {
        stamina--;
        if (stamina == 0) {
            countPlayers--; // как ограничить до 0?
        }
        if (stamina < 0) {
            stamina = 0;
        }
    }

    public static void info() {
        if (countPlayers >= 6) {
            System.out.println("На поле нет свободных мест");
        } else if (countPlayers > 1) {
            System.out.println("Команды неполные. На поле еще есть " + countPlayers + " свободных мест");
        } else if (countPlayers == 1) {
            System.out.println("Команды неполные. На поле еще есть 1 свободное место");
        }
    }
}