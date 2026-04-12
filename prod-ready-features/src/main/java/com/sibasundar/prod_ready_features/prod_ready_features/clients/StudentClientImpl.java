package com.sibasundar.prod_ready_features.prod_ready_features.clients;

import com.sibasundar.prod_ready_features.prod_ready_features.advice.ApiResponse;
import com.sibasundar.prod_ready_features.prod_ready_features.dto.StudentRequestDto;
import com.sibasundar.prod_ready_features.prod_ready_features.dto.StudentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentClientImpl implements StudentClient {

    private final RestClient restClient;

    @Override
    public List<StudentResponseDto> getAllStudents() {
        try {
            ApiResponse<List<StudentResponseDto>> students = restClient.get()
                    .uri("students")
                    .retrieve()
                    .body(new ParameterizedTypeReference<>() {
                    });

            return students.getData();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve students: ", e);
        }
    }

    @Override
    public StudentResponseDto getStudentById(Long studentId) {
        ApiResponse<StudentResponseDto> response = restClient.get()
                .uri("students/{studentId}", studentId)
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
        return response.getData();
    }

    @Override
    public StudentResponseDto createStudent(StudentRequestDto requestDto) {
        ApiResponse<StudentResponseDto> apiResponse = restClient.post()
                .uri("students")
                .body(requestDto)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, (request, response) -> {
                    System.out.println("Detailed error: " + new String(response.getBody().readAllBytes()));
                    throw new RuntimeException("Client Error: " + response.getStatusCode());
                })
                .body(new ParameterizedTypeReference<>() {});

        return apiResponse.getData();
    }
}