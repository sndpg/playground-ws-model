package org.psc.playground.model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@With
@Builder
public class SubModel {

    @FieldMarker(description = "id of this resource")
    private Long id;

    @FieldMarker
    private String name;

    @FieldMarker
    private String description;

    @FieldMarker
    private int numericValue;

    @FieldMarker
    private List<String> tags;

}
