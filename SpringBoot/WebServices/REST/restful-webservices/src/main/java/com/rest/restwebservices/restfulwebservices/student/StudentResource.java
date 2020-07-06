package com.rest.restwebservices.restfulwebservices.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	
	
	@Autowired
	StudentRepository repo;
	
	
	@GetMapping("/students")
	public List<Student> retrieveAllStudent() {
		return repo.findAll();
		
	}
	
	@GetMapping("/students/{id}")
	public Student retrieveAllStudent(@PathVariable Long id) {
		return repo.findById(id).get();
	}
	
}
