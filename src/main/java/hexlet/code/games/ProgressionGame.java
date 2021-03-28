package hexlet.code.games;

import static hexlet.code.games.Rnd.rnd;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 26.03.2021
 */
public class ProgressionGame extends QAGame {
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 50;
    private static final int MIN_LEN = 5;
    private static final int MAX_LEN = 15;
    private static final int MIN_START = -20;
    private static final int MAX_START = 20;

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getName() {
        return "Progression";
    }

    @Override
    public Question nextQuestion() {
        final int[] progression = generateProgression();
        final int hideIndex = rnd(progression.length);
        final String question = toStr(progression, hideIndex);
        return new SimpleQuestion(
                question,
                String.valueOf(progression[hideIndex])
        );
    }

    private String toStr(int[] progression, int hideIndex) {
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

    private int[] generateProgression() {
        final int step = rnd(MIN_STEP, MAX_STEP);
        final int len = rnd(MIN_LEN, MAX_LEN);
        final int[] arr = new int[len];
        arr[0] = rnd(MIN_START, MAX_START);
        for (int i = 1; i < len; i++) {
            arr[i] = arr[i - 1] + step;
        }
        return arr;
    }
}