package com.example.springboot.jpa.easyjpaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.jpa.easyjpaexample.entity.User;
import com.example.springboot.jpa.easyjpaexample.service.UserDaoService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log = 
					LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDaoService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Sipi", "Admin");
		userDaoService.insert(user);
		
		log.info("New User is Created " + user);
		
	}

}
