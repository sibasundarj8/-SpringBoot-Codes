package com.sibasundar.prod_ready_features.prod_ready_features.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDate createdAt;
    private String createdBy;
    private LocalDate updatedAt;
    private String updatedBy;
}