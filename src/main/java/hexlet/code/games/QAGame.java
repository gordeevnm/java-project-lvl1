package hexlet.code.games;

import hexlet.code.Cli;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 26.03.2021
 */
public abstract class QAGame implements Game {
    public abstract Question nextQuestion();

    public abstract String getRules();

    @Override
    public void start() {
        Cli.greet();
        Cli.println(getRules());
        int correctCount = 0;
        while (correctCount < 3) {
            final Question question = nextQuestion();
            Cli.println("Question: " + question.getQuestion());
            Cli.print("Your answer: ");
            final String answer = Cli.read();
            if (question.test(answer)) {
                Cli.println("Correct!");
                correctCount++;
            } else {
                Cli.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + question.getAnswer() + "'.");
                Cli.println("Let's try again, " + Cli.username());
                correctCount = 0;
            }
        }
        Cli.println("Congratulations, "+Cli.username()+"!");
    }
}
