package hexlet.code.games;

import static hexlet.code.util.Rnd.rnd;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 26.03.2021
 */
public final class IsEvenGame {
    public static String getRules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public static String getName() {
        return "Even";
    }

    public static String[][] getQuestions(final int count) {
        final String[][] qa = new String[count][];
        for (int i = 0; i < count; i++) {
            qa[i] = getQuestion();
        }

        return qa;
    }

    private static String[] getQuestion() {
        final int num = rnd();
        return new String[]{
                String.valueOf(num),
                num % 2 == 0 ? "yes" : "no"
        };
    }
}
