package com.kenny.wenny.restful.restful_api.service;

import com.kenny.wenny.restful.restful_api.model.Student;
import lombok.val;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public Student getByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null; // TODO Talk about this in a mo
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
