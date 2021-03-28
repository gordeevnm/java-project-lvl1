package hexlet.code.games;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 27.03.2021
 */
public interface Question {
    String getQuestion();

    String getAnswer();

    boolean test(String answer);
}
