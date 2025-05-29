package com.kenny.wenny.restful.restful_api.controller;

import com.kenny.wenny.restful.restful_api.model.Student;
import com.kenny.wenny.restful.restful_api.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name) {
        val student = studentService.getByName(name);
        return student.isPresent() ? ResponseEntity.ok(student.get()) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        val students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @PostMapping
    public ResponseEntity<Void> createStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/violeta")
    public ResponseEntity<Student> getStudentByName() {
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }
}
