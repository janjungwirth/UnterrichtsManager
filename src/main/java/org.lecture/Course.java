package org.lecture;

import lombok.*;

import java.util.Objects;

@Builder
@Data

public class Course {
    private Datum datum;
    private Zeit start;
    private Zeit end;
    private String place;
    private String lector;
    private Group group;
    private Subject subject;
    private String notes;
}



