package com.example.springboot.jdbctojpa.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.springboot.jdbctojpa.databasedemo.entity.Person;
import com.example.springboot.jdbctojpa.databasedemo.jdbc.PersonJdbcDao;

//@Component
public class PersonJdbcDaoCommandLineRunner  implements CommandLineRunner{
	
	private static final Logger log = 
			LoggerFactory.getLogger(PersonJdbcDaoCommandLineRunner.class);
	
	@Autowired
	PersonJdbcDao jdbcDao;
	
	@Override
	public void run(String... args) throws Exception {
		
		log.info("All users -> {}", jdbcDao.findAll());
		log.info("User with id=10001 -> {}", jdbcDao.findById(10001));
		log.info("User deleted with id=10003 -> {}", jdbcDao.deleteById(10003));
		log.info("Insert user id=10009 -> {}", jdbcDao.insert(new Person(10009, "Timos", "Budapest", new Date())));
		log.info("Update user id=10004 -> {}", jdbcDao.update(new Person(10004, "Kafka", "Prague", new Date())));
		
		
	}

}
