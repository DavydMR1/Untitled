package hw;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Boolean> statistics1 = new HashMap<>();
        HashMap<Integer, Boolean> statistics2 = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            Game game = new Game(3);
            statistics1.put(i, game.guess(game.getOptions()));
            statistics2.put(i, game.guess(game.getOptions()));
        }
        int a = 0;
        for (int i = 0; i < statistics1.size(); i++) {
            if (statistics1.get(i)) {
                a++;
            }
        }
        double b = (double) a / statistics1.size();
        System.out.println("Процент побед при 1 попытке: " + b * 100);
        a = 0;
        for (int i = 0; i < statistics2.size(); i++) {
            if (statistics2.get(i)) {
                a++;
            }
        }
        b = (double) a / statistics2.size();
        System.out.println("Процент побед при 2 попытке: " + b * 100);
    }
}
