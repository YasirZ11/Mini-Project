package com.example.Student.system.service;

import com.example.Student.system.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student>getAllstudents();
}
