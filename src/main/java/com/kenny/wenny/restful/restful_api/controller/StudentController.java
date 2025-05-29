package com.kenny.wenny.restful.restful_api.controller;

import com.kenny.wenny.restful.restful_api.model.Student;
import com.kenny.wenny.restful.restful_api.service.StudentService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        val students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/violeta")
    public ResponseEntity<Student> getStudentByName() {
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }
}
