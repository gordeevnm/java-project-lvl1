package hexlet.code.games;

import static hexlet.code.games.Rnd.rnd;
import static java.lang.Math.*;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 26.03.2021
 */
public class GcdGame extends QAGame {
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 50;

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getName() {
        return "GCD";
    }

    @Override
    public Question nextQuestion() {
        final int a = rnd(MIN_NUM, MAX_NUM);
        final int b = rnd(MIN_NUM, MAX_NUM);
        final String question = String.format("%d %d", a, b);
        return new SimpleQuestion(
                question,
                String.valueOf(gcd(a, b))
        );
    }

    private static int gcd(int a, int b) {
        int m = 1;
        if (max(a, b) % min(a, b) == 0) {
            return min(a, b);
        }
        for (int i = 2; i <= floor(sqrt(min(a, b))); i++) {
            if (a % i == 0 && b % i == 0) {
                m = i;
            }
        }
        return m;
    }
}
