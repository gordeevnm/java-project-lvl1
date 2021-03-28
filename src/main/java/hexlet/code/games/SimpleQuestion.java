package hexlet.code.games;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 27.03.2021
 */
public class SimpleQuestion implements Question {
    private final String question;
    private final String answer;

    public SimpleQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean test(String answer) {
        return this.answer.equalsIgnoreCase(answer);
    }
}
