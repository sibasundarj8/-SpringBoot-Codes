package com.sibasundar.prod_ready_features.prod_ready_features;

import com.sibasundar.prod_ready_features.prod_ready_features.clients.StudentClient;
import com.sibasundar.prod_ready_features.prod_ready_features.dto.StudentRequestDto;
import com.sibasundar.prod_ready_features.prod_ready_features.dto.StudentResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RestClientTests {

    @Autowired
    private StudentClient studentClient;

    @Test
    public void studentClientGetAllStudentsTest() {
        List<StudentResponseDto> allStudents = studentClient.getAllStudents();
        System.out.println(allStudents);
    }

    @Test
    public void studentClientGetStudentByIdTest() {
        StudentResponseDto student = studentClient.getStudentById(1L);
        System.out.println(student);
    }

    @Test
    public void studentClientCreateStudentTest() {
        StudentRequestDto studentRequestDto = StudentRequestDto.builder()
                .name("Mahesh Rout")
                .registrationNumber("2301326185")
                .fees(71500)
                .build();

        StudentResponseDto student = studentClient.createStudent(studentRequestDto);
        System.out.println(student);
    }
}