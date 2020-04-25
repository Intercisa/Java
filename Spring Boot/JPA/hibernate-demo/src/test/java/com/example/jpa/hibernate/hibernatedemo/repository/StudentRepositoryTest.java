package com.example.jpa.hibernate.hibernatedemo.repository;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.jpa.hibernate.hibernatedemo.HibernateDemoApplication;
import com.example.jpa.hibernate.hibernatedemo.entity.Passport;
import com.example.jpa.hibernate.hibernatedemo.entity.Student;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = HibernateDemoApplication.class) //specifying the class we want to launch (use the Application class!!!!)
class StudentRepositoryTest {
	
	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Autowired
	StudentRepository repository;
	
	@Test
	void retrieve_student_and_passport() {
		Student student = em.find(Student.class, 20001L);
		log.info("studnet -> {}", student);
		Passport passport = student.getPassport();
		log.info("passport -> {}", passport);
	}
}
