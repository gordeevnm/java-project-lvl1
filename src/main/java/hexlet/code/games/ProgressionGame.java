package hexlet.code.games;

import static hexlet.code.util.Rnd.rnd;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 26.03.2021
 */
public final class ProgressionGame {
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 50;
    private static final int MIN_LEN = 5;
    private static final int MAX_LEN = 15;
    private static final int MIN_START = -20;
    private static final int MAX_START = 20;


    public static String getRules() {
        return "What number is missing in the progression?";
    }

    public static String getName() {
        return "Progression";
    }

    public static String[][] getQuestions(final int count) {
        final String[][] qa = new String[count][];
        for (int i = 0; i < count; i++) {
            qa[i] = getQuestion();
        }

        return qa;
    }

    private static String[] getQuestion() {
        final int[] progression = generateProgression();
        final int hideIndex = rnd(progression.length);
        final String question = toStr(progression, hideIndex);
        return new String[]{
                question,
                String.valueOf(progression[hideIndex])
        };
    }

    private static String toStr(final int[] progression, final int hideIndex) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hideIndex; i++) {
            sb.append(progression[i]).append(" ");
        }
        sb.append(".. ");
        for (int i = hideIndex + 1; i < progression.length; i++) {
            sb.append(progression[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    private static int[] generateProgression() {
        final int step = rnd(MIN_STEP, MAX_STEP);
        final int len = rnd(MIN_LEN, MAX_LEN);
        final int[] progression = new int[len];
        progression[0] = rnd(MIN_START, MAX_START);
        for (int i = 1; i < len; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }
}
