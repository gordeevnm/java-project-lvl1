package hexlet.code.games;

import java.util.Random;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 26.03.2021
 */
public class IsEvenGame extends QAGame {
    private final Random random = new Random();

    @Override
    public String getRules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    @Override
    public Question nextQuestion() {
        final int num = random.nextInt();
        return new SimpleQuestion(
                String.valueOf(num),
                num % 2 == 0 ? "yes" : "no"
        );
    }

    public String getName() {
        return "Even";
    }
}
