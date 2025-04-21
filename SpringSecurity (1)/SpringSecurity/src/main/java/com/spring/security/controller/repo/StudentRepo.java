package com.spring.security.controller.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.security.entity.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	Student save(Student student);

	void deleteById(Student student);

}
