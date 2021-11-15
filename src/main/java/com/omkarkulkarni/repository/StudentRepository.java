package com.omkarkulkarni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omkarkulkarni.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
