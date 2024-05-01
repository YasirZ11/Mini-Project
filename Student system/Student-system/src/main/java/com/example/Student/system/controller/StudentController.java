package com.example.Student.system.controller;

import com.example.Student.system.model.Student;
import com.example.Student.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student Added Successfully";
    }

    @GetMapping("/students")
    public List<Student>getAllStudents(){
        return studentService.getAllstudents();
    }

}
