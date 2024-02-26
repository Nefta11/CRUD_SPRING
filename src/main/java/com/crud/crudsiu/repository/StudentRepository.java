package com.crud.crudsiu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.crudsiu.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
