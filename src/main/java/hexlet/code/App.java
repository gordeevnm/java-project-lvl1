package hexlet.code;

public class App {
    private static final int QUESTIONS_COUNT = 3;

    public static void main(final String[] args) {
        Engine.printMenu();

        final String gameNum = Engine.read();

        if (Engine.specialCase(gameNum)) {
            return;
        }

        final String rules = Engine.getGameRules(gameNum);
        final String[][] questionAnswerPairs = Engine.getQuestionAnswerPairs(gameNum, QUESTIONS_COUNT);
        Engine.runQuestionAnswerGame(rules, questionAnswerPairs);
    }
}
