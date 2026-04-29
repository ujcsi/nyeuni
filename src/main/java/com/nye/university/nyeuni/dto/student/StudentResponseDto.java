package com.nye.university.nyeuni.dto.student;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class StudentResponseDto {
    private Long id;
    private String name;
    private Integer age;
    private Long courseId;
    private String courseName;


}



