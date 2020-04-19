package org.psc.playground.model.utils;

import org.psc.playground.model.Question;

public class QuestionEvaluator {

    public static Boolean evaluate(Question question, Object answer) {
        if (question == null || question.getAnswer() == null) {
            return false;
        }

        return question.getAnswer().equals(answer);
    }
}
