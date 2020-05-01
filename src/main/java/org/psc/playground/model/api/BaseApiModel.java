package org.psc.playground.model.api;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@With
@Builder
public class BaseApiModel {
    private Long id;

    private String name;

    private String description;

    private int numericValue;

    private List<String> tags;
}
