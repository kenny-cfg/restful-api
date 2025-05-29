package com.kenny.wenny.restful.restful_api.controller;

import com.kenny.wenny.restful.restful_api.model.Student;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @GetMapping
    @ResponseBody
    public List<Student> getStudent() {
        val firstStudent = Student.builder()
                .age(25)
                .name("John")
                .course("Java")
                .build();
        val secondStudent = Student.builder()
                .age(30)
                .name("Barbara")
                .course("Python")
                .build();
        return List.of(firstStudent, secondStudent);
    }
}
