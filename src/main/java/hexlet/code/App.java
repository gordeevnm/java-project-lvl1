package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.IsEvenGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.util.Cli;

public class App {

    public static void main(final String[] args) {
        Cli.println("Please enter the game number and press Enter.");
        Cli.println("1 - Greet");
        Cli.println("2 - Even");
        Cli.println("3 - Calc");
        Cli.println("4 - GCD");
        Cli.println("5 - Progression");
        Cli.println("6 - Prime");
        Cli.println("0 - Exit");
        Cli.print("Your choice: ");
        final String input = Cli.read();
        final int gameNum = Integer.parseInt(input);
        final String[][] qaArr;
        final String rules;
        switch (gameNum) {
            case 0:
                return;
            case 1:
                Cli.greet();
                return;
            case 2:
                rules = ("Answer 'yes' if number even otherwise answer 'no'.");
                qaArr = IsEvenGame.getQuestions(3);
                break;
            case 3:
                rules = ("What is the result of the expression?");
                qaArr = CalcGame.getQuestions(3);
                break;
            case 4:
                rules = ("Find the greatest common divisor of given numbers.");
                qaArr = GcdGame.getQuestions(3);
                break;
            case 5:
                rules = ("What number is missing in the progression?");
                qaArr = ProgressionGame.getQuestions(3);
                break;
            case 6:
                rules = ("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                qaArr = PrimeGame.getQuestions(3);
                break;
            default:
                return;
        }
        Cli.greet();
        Cli.println(rules);

        for (final String[] qa : qaArr) {
            final String q = qa[0];
            final String a = qa[1];

            Cli.println("Question: " + q);
            Cli.print("Your answer: ");
            final String answer = Cli.read();
            if (answer.equals(a)) {
                Cli.println("Correct!");
            } else {
                Cli.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + a + "'.");
                Cli.println("Let's try again, " + Cli.username() + "!");
                return;
            }
        }
        Cli.println("Congratulations, " + Cli.username() + "!");
    }
}
