package com.crud.crudsiu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crudsiu.entity.Student;
import com.crud.crudsiu.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    public Student updateStutend(Long id,Student student){
    student.setStudentId(id);
    return studentRepository.save(student);
    }

    public void  deleteStudent(Long id){
        studentRepository.deleteById(id);;
    }
}
