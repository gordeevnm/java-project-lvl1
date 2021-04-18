package hexlet.code.games;

import static hexlet.code.util.Rnd.rnd;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 28.03.2021
 */
public final class CalcGame {
    private static final int MIN_NUM = -100;
    private static final int MAX_NUM = 100;
    private static final char[] OPERATORS = new char[]{'+', '*', '-'};

    public static String getRules() {
        return "What is the result of the expression?";
    }

    public static String getName() {
        return "Calc";
    }

    public static String[][] getQuestions(final int count) {
        final String[][] qa = new String[count][];
        for (int i = 0; i < count; i++) {
            final int a = rnd(MIN_NUM, MAX_NUM);
            final int b = rnd(MIN_NUM, MAX_NUM);
            final int opNum = rnd(OPERATORS.length);
            final char operator = OPERATORS[opNum];
            final String question = String.format(
                    "%d %s %d",
                    a,
                    operator,
                    b
            );
            final int answer = switch (operator) {
                case '+' -> a + b;
                case '-' -> a - b;
                default -> a * b;
            };
            qa[i] = new String[]{
                    question,
                    String.valueOf(answer)
            };
        }

        return qa;
    }
}
