package com.nye.university.nyeuni.dto.student;

import com.nye.university.nyeuni.entity.Course;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

public class StudentRequestDto {
    @NotBlank(message = "Student name is requered!")
    private String name;
    private Integer age;


    private Long curseId;




}


