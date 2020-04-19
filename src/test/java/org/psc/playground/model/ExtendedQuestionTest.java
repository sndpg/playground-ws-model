package org.psc.playground.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ExtendedQuestionTest {

    @Test
    void testExtendedQuestion() {
        Question extendedQuestion = new ExtendedQuestion()
                .withId("2")
                .withQuestion("Is this really true?")
                .withAnswer("no");

        assertThat(extendedQuestion.getAnswer(), is("no"));
    }

}