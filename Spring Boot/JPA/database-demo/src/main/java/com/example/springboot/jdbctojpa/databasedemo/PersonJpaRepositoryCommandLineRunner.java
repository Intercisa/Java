package com.example.springboot.jdbctojpa.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.jdbctojpa.databasedemo.entity.Person;
import com.example.springboot.jdbctojpa.databasedemo.jpa.PersonJpaRepository;

@Component
public class PersonJpaRepositoryCommandLineRunner  implements CommandLineRunner{
	
	private static final Logger log = 
			LoggerFactory.getLogger(PersonJpaRepositoryCommandLineRunner.class);
	
	@Autowired
	PersonJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		log.info("All users -> {}", repository.findAll());
		log.info("User with id=10001 -> {}", repository.findById(10001));
		log.info("Insert user id=10009 -> {}", repository.insert(new Person(10009, "Timos", "Budapest", new Date())));
		log.info("Update user id=10004 -> {}", repository.update(new Person(10004, "Kafka", "Prague", new Date())));
		
		
	}

}
