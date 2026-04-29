package com.nye.university.nyeuni.dto.course;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourseRequestDto {
 @NotBlank(message = "Course name is required!")
 private String name;
 private String teacherName;


}
