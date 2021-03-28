package hexlet.code.games;

import hexlet.code.util.Cli;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 26.03.2021
 */
public abstract class QAGame implements Game {

    public static final int QUESTIONS_COUNT = 3;

    /**
     * @return new question to gamer.
     */
    public abstract Question nextQuestion();

    /**
     * @return rules of game.
     */
    public abstract String getRules();

    @Override
    public final void start() {
        Cli.greet();
        Cli.println(getRules());
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            final Question question = nextQuestion();
            Cli.println("Question: " + question.getQuestion());
            Cli.print("Your answer: ");
            final String answer = Cli.read();
            if (question.test(answer)) {
                Cli.println("Correct!");
            } else {
                Cli.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + question.getAnswer() + "'.");
                Cli.println("Let's try again, " + Cli.username() + "!");
                return;
            }
        }
        Cli.println("Congratulations, " + Cli.username() + "!");
    }
}
