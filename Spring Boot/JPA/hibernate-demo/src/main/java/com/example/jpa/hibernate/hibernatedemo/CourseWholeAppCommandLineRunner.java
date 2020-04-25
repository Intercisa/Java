package com.example.jpa.hibernate.hibernatedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa.hibernate.hibernatedemo.repository.CourseRepository;
import com.example.jpa.hibernate.hibernatedemo.repository.StudentRepository;

@Component
public class CourseWholeAppCommandLineRunner implements CommandLineRunner {

	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository courseRepo;

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		studentRepo.saveStudentWithPassport();
		
		
	}

}
