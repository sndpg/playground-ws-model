package org.psc.playground.model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@With
@Builder
@ClassMarker
public class BaseModel {

    private Long id;

    private String name;

    private String description;

    private int numericValue;

    private List<String> tags;
}
