package com.example.jpa.hibernate.hibernatedemo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

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
	
	//Session & Session Factory
	//EntityManager & Persistence Context
	//Transactional
	
	@Test
	//@Transactional //Persistence Context - without @Transactional all calls have their own transaction 
	//if just one operation fail - all should fail -> roll back -> that is the importance of @Transactional
	public void someTest() {
		//repository.someOperationToUnderstandPersistenceContext();
	}
	
	@Test
	@Transactional
	void retrieve_student_and_passport() {
		Student student = em.find(Student.class, 20001L);
		log.info("studnet -> {}", student); //if Passport in Student -> fetch = FetchType.LAZY the transaction ends here  
		Passport passport = student.getPassport(); //if FetchType.LAZY -> && there is no @Transactional on the method -> throws an LazyInitializationException
		log.info("passport -> {}", passport);
	}
	
	@Test
	@Transactional
	void retrieve_passport_and_associatedStudent() {
		Passport passport = em.find(Passport.class, 40001L);
		log.info("passport -> {}", passport); 
		log.info("student -> {}", passport.getStudent()); 
	}
	
	@Test
	@Transactional
	void retrieve_student_and_associatedCourses() {
		Student student = em.find(Student.class, 20002L);
		log.info("studnet -> {}", student);
		log.info("studnet -> {}", student.getCourses());
	}
	
	
	
	
	
}
