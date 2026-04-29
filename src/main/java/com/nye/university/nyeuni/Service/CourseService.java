package com.nye.university.nyeuni.Service;

import com.nye.university.nyeuni.dto.course.CourseRequestDto;
import com.nye.university.nyeuni.dto.course.CourseResponseDto;
import com.nye.university.nyeuni.entity.Course;
import com.nye.university.nyeuni.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public CourseResponseDto createCourse (CourseRequestDto courseRequestDto) {
        Course course = Course.builder()
                .name(courseRequestDto.getName())
                .teacherName(courseRequestDto.getTeacherName())
                .build();
        Course savedCourse =courseRepository.save(course);
        return mapToDto(savedCourse);
    }


    private CourseResponseDto mapToDto(Course course) {
        return CourseResponseDto.builder()
                .id(course.getId())
                .name(course.getName())
                .teacherName(course.getTeacherName())
                .build();
    }
}
