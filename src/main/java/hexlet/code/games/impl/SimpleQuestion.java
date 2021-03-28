package hexlet.code.games.impl;

import hexlet.code.games.Question;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 27.03.2021
 */
public final  class SimpleQuestion implements Question {
    private final String question;
    private final String answer;

    public SimpleQuestion(final String questionArg, final String answerArg) {
        this.question = questionArg;
        this.answer = answerArg;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean test(final String answerArg) {
        return this.answer.equalsIgnoreCase(answerArg);
    }
}
