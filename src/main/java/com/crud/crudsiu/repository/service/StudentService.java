package com.crud.crudsiu.repository.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crudsiu.entity.Student;
import com.crud.crudsiu.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
