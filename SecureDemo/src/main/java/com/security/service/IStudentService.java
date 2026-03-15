package com.security.service;

import com.security.entity.Student;

import java.util.List;

public interface IStudentService {
    public Student createStudent(Student student);
    public List<Student> getAllStudents();
    public String deleteStudentById(Long id);
}
