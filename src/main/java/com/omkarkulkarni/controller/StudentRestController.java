package com.omkarkulkarni.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omkarkulkarni.model.Student;
import com.omkarkulkarni.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
//	private static final Logger logger = Logger.getLogger(StudentRestController.class);
	@Autowired
	private IStudentService iStudentService;
	
	@PostMapping("/create")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		Integer id = iStudentService.saveStudent(student);
		String body = "Student Saved with id : " + id;
		return ResponseEntity.ok(body);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> list = iStudentService.getAllStudents();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<Student> getOneStudent(@PathVariable Integer id) {
		Student student = iStudentService.getStudent(id);
		return ResponseEntity.ok(student);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
		iStudentService.deleteStudent(id);
		String body = "Student Deleted!!" + id;
		return ResponseEntity.ok(body);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Student student) {
		iStudentService.updateStudent(student);
		String body = "Student Updated!!" + student.getStudentId();
		return ResponseEntity.ok(body);
	}
}
