package com.security.controller;

import com.security.entity.Student;
import com.security.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
    return iStudentService.createStudent(student);
    }
    @GetMapping("/get")
    public List<Student> getAllStudents(){
        return iStudentService.getAllStudents();
    }
    @DeleteMapping("/delete/{sId}")
    public String deletStudentById(@PathVariable("sId") Long id){
        return iStudentService.deleteStudentById(id);
    }
}
