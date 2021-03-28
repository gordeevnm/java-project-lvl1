package hexlet.code.games.impl;

import hexlet.code.games.QAGame;
import hexlet.code.games.Question;

import static hexlet.code.util.Rnd.rnd;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 26.03.2021
 */
public final class IsEvenGame extends QAGame {

    @Override
    public String getRules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    @Override
    public Question nextQuestion() {
        final int num = rnd();
        return new SimpleQuestion(
                String.valueOf(num),
                num % 2 == 0 ? "yes" : "no"
        );
    }

    public String getName() {
        return "Even";
    }
}
