package com.sibasundar.prod_ready_features.prod_ready_features.dto;

import java.util.Set;

public record StudentResponseDto(Long id, String name, String registrationNumber, Set<SubjectResponseDto> subjects) {
}