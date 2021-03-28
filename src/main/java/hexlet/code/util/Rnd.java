package hexlet.code.util;

import java.util.Random;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 28.03.2021
 */
public final class Rnd {
    private static final Random RANDOM = new Random();

    public static int rnd(final int min, final int max) {
        return min + RANDOM.nextInt(max - min + 1);
    }

    public static int rnd(final int bound) {
        return RANDOM.nextInt(bound);
    }

    public static int rnd() {
        return RANDOM.nextInt();
    }

    public static boolean bool() {
        return RANDOM.nextBoolean();
    }
}
