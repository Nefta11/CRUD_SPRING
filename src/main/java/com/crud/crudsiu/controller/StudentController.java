package com.crud.crudsiu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crudsiu.entity.Student;
import com.crud.crudsiu.service.StudentService;

@RestController
@RequestMapping(path = "/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getBId(@PathVariable("studentId") Long studentId) {
        return studentService.getStudent(studentId);
    }

    @PutMapping("/{studentId}")
    public Student updateStutend(@PathVariable Long studentId,@RequestBody Student student ){
        return studentService.updateStutend(studentId,student);
    }
    
    @DeleteMapping("/{studentId}")
    public String deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
        return "Eliminado exitosamente";
    }
}
