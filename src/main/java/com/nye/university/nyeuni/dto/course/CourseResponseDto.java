package com.nye.university.nyeuni.dto.course;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CourseResponseDto {
    private Long id;
    private String name;
    private String teacherName;
}
