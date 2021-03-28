package hexlet.code.games;

import java.util.Random;
import java.util.function.BiFunction;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 28.03.2021
 */
public class CalcGame extends QAGame {
    private static final int MIN_NUM = -100;
    private static final int MAX_NUM = 100;

    private final Random random = new Random();

    @Override
    public String getName() {
        return "Calc";
    }

    @Override
    public Question nextQuestion() {
        final int a = rand();
        final int b = rand();
        final Operator operator = Operator.values()[random.nextInt(Operator.values().length)];
        final String question = String.format(
                "%d %s %d",
                a,
                operator.getOpName(),
                b
        );
        return new SimpleQuestion(
                question,
                String.valueOf(operator.apply(a, b))
        );
    }

    private int rand() {
        return MIN_NUM + random.nextInt(MAX_NUM - MIN_NUM + 1);
    }

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    private enum Operator {
        ADD('+', (a, b) -> a + b),
        MULTIPLY('*', (a, b) -> a * b),
        SUBTRACT('-', (a, b) -> a - b);

        private final char opName;
        private final BiFunction<Integer, Integer, Integer> function;

        Operator(char opName, BiFunction<Integer, Integer, Integer> function) {
            this.opName = opName;
            this.function = function;
        }

        public int apply(int a, int b) {
            return function.apply(a, b);
        }

        public char getOpName() {
            return opName;
        }
    }
}
