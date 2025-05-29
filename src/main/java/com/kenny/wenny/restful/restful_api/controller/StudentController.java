package com.kenny.wenny.restful.restful_api.controller;

import com.kenny.wenny.restful.restful_api.model.Student;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @GetMapping
    public ResponseEntity<List<Student>> getStudent() {
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
        return ResponseEntity.ok(
                List.of(firstStudent, secondStudent)
        );
    }

    @GetMapping("/violeta")
    public ResponseEntity<Student> getStudentByName() {
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }
}
