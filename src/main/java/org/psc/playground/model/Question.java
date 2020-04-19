package org.psc.playground.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class for a default question.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    /**
     * Id.
     */
    private String id;

    /**
     * Name.
     */
    private String name;

    /**
     * The question's text (= the actual question.
     */
    private String question;

    /**
     * The answer to this question.
     */
    private Object answer;
}
