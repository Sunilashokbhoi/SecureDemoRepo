package com.security.service;

import com.security.entity.Student;
import com.security.repo.StudentRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public String deleteStudentById(Long id) {
        Optional<Student> student = studentRepo.findById(id);
        if(student.isPresent()){
            studentRepo.deleteById(id);
            return "Student id is "+id+" Successfuly Deleted";
        }else{
            throw new EntityNotFoundException("Student is Not Found");
        }

    }
}
