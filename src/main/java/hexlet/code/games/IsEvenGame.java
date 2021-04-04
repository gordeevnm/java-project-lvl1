package hexlet.code.games;

import static hexlet.code.util.Rnd.rnd;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 26.03.2021
 */
public final class IsEvenGame {
    public static String[][] getQuestions(final int count) {
        final String[][] qa = new String[count][];
        for (int i = 0; i < count; i++) {
            final int num = rnd();
            qa[i] = new String[]{
                    String.valueOf(num),
                    num % 2 == 0 ? "yes" : "no"
            };
        }

        return qa;
    }
}
