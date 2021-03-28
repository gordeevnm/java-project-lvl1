package hexlet.code.games;

import java.util.Random;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 28.03.2021
 */
public class Rnd {
    private static final Random random = new Random();

    public static int rnd(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static int rnd(int bound) {
        return random.nextInt(bound);
    }

    public static int rnd() {
        return random.nextInt();
    }

    public static boolean bool() {
        return random.nextBoolean();
    }
}
