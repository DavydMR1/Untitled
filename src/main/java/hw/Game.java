package hw;

import lombok.Getter;

import java.util.Arrays;
import java.util.Random;

public class Game {
    @Getter
    private boolean[] options;
    private final boolean[] attempts;
    public Game(int size) {
        options = new boolean[size];
        Arrays.fill(options, false);
        options[randomizer(size)] = true;
        attempts = new boolean[size];
        Arrays.fill(attempts, false);
    }

    private int randomizer(int value) {
        Random random = new Random();
        return random.nextInt(value);
    }

    public boolean[] getOptions() {
        return options;
    }

    public boolean guess(boolean[] array) {
        boolean a = false;
        boolean c = false;
        while (!a) {
            int b = randomizer(attempts.length);
            if (!attempts[b]) {
                attempts[b] = true;
                c = array[b];
                a = true;
            }
        }
        return c;
    }
}
