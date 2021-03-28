package hexlet.code.games;

import java.util.function.BiFunction;

import static hexlet.code.games.Rnd.rnd;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 28.03.2021
 */
public class CalcGame extends QAGame {
    private static final int MIN_NUM = -100;
    private static final int MAX_NUM = 100;

    @Override
    public String getName() {
        return "Calc";
    }

    @Override
    public Question nextQuestion() {
        final int a = rnd(MIN_NUM, MAX_NUM);
        final int b = rnd(MIN_NUM, MAX_NUM);
        final Operator operator = Operator.values()[rnd(Operator.values().length)];
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
