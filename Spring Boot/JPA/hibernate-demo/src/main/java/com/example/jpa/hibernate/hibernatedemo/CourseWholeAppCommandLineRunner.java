package com.example.jpa.hibernate.hibernatedemo;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa.hibernate.hibernatedemo.entity.Review;
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
		
		//studentRepo.saveStudentWithPassport();	
		List<Review> reviews = Arrays.asList(new Review("5", "Hats up!"), new Review("5", "So good!"));
		courseRepo.addReviewsForCourse(10004L, reviews);
		
		
	}

}
