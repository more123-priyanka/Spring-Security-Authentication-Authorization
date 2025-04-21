package com.spring.security.controller;

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

import com.spring.security.entity.Student;
import com.spring.security.service.StudentService;

@RestController
@RequestMapping("/api/v1")

public class StudentController {

	@Autowired
	private StudentService studentService;
	private List<Student> student;

	@GetMapping("/Students")
	public List<Student> getAllStudent() {

		return studentService.findAllStudent();
	}

	@GetMapping("/Students/{id}")
	public Optional<Student> getStudentById(@PathVariable int id) {
		return studentService.findStudentById(id);

	}

	@PostMapping("/Students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@DeleteMapping("/Students/{id}")
	public String deletStudentById(@PathVariable int id) {
		 studentService.deleteById(id);
		return "Student Deleted Sucessfully";
	}

	@PutMapping("/Students/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		return studentService.saveStudent(student);

	}
}
