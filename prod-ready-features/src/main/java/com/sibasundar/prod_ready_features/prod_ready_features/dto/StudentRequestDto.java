package com.sibasundar.prod_ready_features.prod_ready_features.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StudentRequestDto {
    private String name;
    private String registrationNumber;
    private List<Long> subjectIds = new ArrayList<>();
    private Integer fees;
}