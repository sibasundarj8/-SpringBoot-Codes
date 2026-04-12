package com.sibasundar.prod_ready_features.prod_ready_features.clients;

import com.sibasundar.prod_ready_features.prod_ready_features.dto.StudentRequestDto;
import com.sibasundar.prod_ready_features.prod_ready_features.dto.StudentResponseDto;

import java.util.List;

public interface StudentClient {
    List<StudentResponseDto> getAllStudents();
    StudentResponseDto getStudentById(Long id);
    StudentResponseDto createStudent(StudentRequestDto requestDto);
}