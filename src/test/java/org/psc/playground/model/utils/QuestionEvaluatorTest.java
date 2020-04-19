package org.psc.playground.model.utils;

import org.junit.jupiter.api.Test;
import org.psc.playground.model.ExtendedQuestion;
import org.psc.playground.model.Question;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class QuestionEvaluatorTest {

    @Test
    void testEvaluate() {
        Question extendedQuestion = new ExtendedQuestion()
                .withId("2")
                .withQuestion("Is this really true?")
                .withAnswer("no");

        assertThat(QuestionEvaluator.evaluate(extendedQuestion, "no"), is(true));

        Question baseQuestion = new Question()
                .withId("2")
                .withQuestion("Is this really true?")
                .withAnswer(true);

        assertThat(QuestionEvaluator.evaluate(baseQuestion, true), is(true));
    }

}