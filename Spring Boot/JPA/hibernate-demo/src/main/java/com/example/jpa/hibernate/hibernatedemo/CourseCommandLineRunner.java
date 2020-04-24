package com.example.jpa.hibernate.hibernatedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa.hibernate.hibernatedemo.repository.CourseRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.playingWithEntityManager();
	}

}
