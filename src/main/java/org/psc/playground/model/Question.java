package org.psc.playground.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * Class for a default question.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@With
@SuperBuilder
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
