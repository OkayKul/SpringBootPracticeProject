package com.omkarkulkarni.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkarkulkarni.model.Student;
import com.omkarkulkarni.repository.StudentRepository;
import com.omkarkulkarni.service.IStudentService;
import com.omkarkulkarni.service.util.StudentUtil;

@Service
public class StudetnServiceImpl implements IStudentService {
	@Autowired 
	private StudentRepository studentRepository;
	
//	@Autowired
//	private StudentUtil studentUtil;

	public Integer saveStudent(Student student) {
		
		StudentUtil.calculateGST(student);
		student = studentRepository.save(student);
		// TODO Auto-generated method stub
		return student.getStudentId();
	}

	public void updateStudent(Student student) {
		StudentUtil.calculateGST(student);
		studentRepository.save(student);
	}

	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}

	public Student getStudent(Integer id) {
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if(optionalStudent.isPresent()) {
			return optionalStudent.get();
		}
		return null;
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
