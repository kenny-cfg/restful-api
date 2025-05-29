package com.kenny.wenny.restful.restful_api.service;

import com.kenny.wenny.restful.restful_api.model.Student;
import lombok.val;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {
    public List<Student> getAllStudents() {
        val firstStudent = Student.builder()
                .age(25)
                .name("John")
                .course("Java")
                .build();
        val secondStudent = Student.builder()
                .age(90)
                .name("Steve")
                .course("Python")
                .build();
        return List.of(firstStudent, secondStudent);
    }
}
