package com.spring.security.service;


import java.util.List;
import java.util.Optional;

import com.spring.security.entity.Student;


public interface StudentService {
	public List<Student> findAllStudent();

	String deleteById(Integer id);

	Student saveStudent(Student student);

	public Optional<Student> findStudentById(int id);

	

}
