package org.psc.playground.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@With
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class ExtendedQuestion extends Question {

    private String answer;

}
