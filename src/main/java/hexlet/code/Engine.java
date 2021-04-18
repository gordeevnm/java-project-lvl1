package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.IsEvenGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.util.Cli;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 14.04.2021
 */
public class Engine {
    public static void println(final String str) {
        Cli.println(str);
    }

    public static void print(final String str) {
        Cli.print(str);
    }

    public static String read() {
        return Cli.read();
    }

    public static String greet() {
        return Cli.greet();
    }

    public static void printMenu() {
        Engine.println("Please enter the game number and press Enter.");
        Engine.println("1 - Greet");
        Engine.println("2 - " + IsEvenGame.getName());
        Engine.println("3 - " + CalcGame.getName());
        Engine.println("4 - " + GcdGame.getName());
        Engine.println("5 - " + ProgressionGame.getName());
        Engine.println("6 - " + PrimeGame.getName());
        Engine.println("0 - Exit");
        Engine.print("Your choice: ");
    }

    public static boolean specialCase(final String gameNum) {
        if (gameNum.equals("1")) {
            Engine.greet();
            return true;
        }
        return false;
    }

    public static String getGameRules(final String gameNum) {
        return switch (gameNum) {
            case "2" -> IsEvenGame.getRules();
            case "3" -> CalcGame.getRules();
            case "4" -> GcdGame.getRules();
            case "5" -> ProgressionGame.getRules();
            case "6" -> PrimeGame.getRules();
            default -> throw new IllegalArgumentException("Unsupported game id#" + gameNum);
        };
    }

    public static String[][] getQuestionAnswerPairs(final String gameNum, final int questionsCount) {
        return switch (gameNum) {
            case "2" -> IsEvenGame.getQuestions(questionsCount);
            case "3" -> CalcGame.getQuestions(questionsCount);
            case "4" -> GcdGame.getQuestions(questionsCount);
            case "5" -> ProgressionGame.getQuestions(questionsCount);
            case "6" -> PrimeGame.getQuestions(questionsCount);
            default -> throw new IllegalArgumentException("Unsupported game id#" + gameNum);
        };
    }

    public static void runQuestionAnswerGame(final String rules, final String[][] qaArr) {
        final String username = greet();
        println(rules);
        for (final String[] qa : qaArr) {
            final String q = qa[0];
            final String a = qa[1];

            println("Question: " + q);
            print("Your answer: ");
            final String answer = read();
            if (answer.equals(a)) {
                println("Correct!");
            } else {
                println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + a + "'.");
                println("Let's try again, " + username + "!");
                return;
            }
        }
        println("Congratulations, " + username + "!");
    }
}
