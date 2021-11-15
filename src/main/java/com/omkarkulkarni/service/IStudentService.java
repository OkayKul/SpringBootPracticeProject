package com.omkarkulkarni.service;

import java.util.List;

import com.omkarkulkarni.model.Student;

public interface IStudentService {
	Integer saveStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Integer id);
	Student getStudent(Integer id);
	List<Student> getAllStudents();

}
