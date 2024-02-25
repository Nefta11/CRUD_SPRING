package com.crud.crudsiu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crudsiu.entity.Student;
import com.crud.crudsiu.service.StudentService;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }

    
    @GetMapping("GetOne/{studentId}")
    public Optional<Student> getBId(@PathVariable("studentId")Long studentId){
        return studentService.getStudent(studentId);
    }

    @PostMapping
    public Student saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student;
    }

    

    @DeleteMapping("delete/{studentId}")
    public String deleteStudent(@PathVariable ("studentId")Long studentId){
        studentService.deleteStudent(studentId);
        return "Eliminado exitosamente";
    }


    


}
