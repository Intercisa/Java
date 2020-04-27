package com.example.jpa.hibernate.hibernatedemo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.hibernate.hibernatedemo.entity.Course;
import com.example.jpa.hibernate.hibernatedemo.entity.Passport;
import com.example.jpa.hibernate.hibernatedemo.entity.Student;

@Repository
@Transactional
public class StudentRepository {
	
	
	@PersistenceContext
	EntityManager em;
	
	public Student findById(Long id) {
		return em.find(Student.class, id);
	}
	
	
	public Student save(Student student) {
		if(student.getId()==null)
			em.persist(student);	 //if id == null -> insert
		else 
			em.merge(student);	//else -> update
			
		return student;
	}
	
	
	public void deleteById(Long id) {
		Student student = findById(id);
		em.remove(student);
	}
	
	public void saveStudentWithPassport() {
		Passport passport = new Passport("Z123456");//create passport
		em.persist(passport);						//persist passport
		
		Student student = new Student("Balage"); //create student
		
		student.setPassport(passport);			//establish relationship	
		em.persist(student);					//persist student
	}
	
	
	
	public void someOperationToUnderstandPersistenceContext() {//Transaction starts here
		//Database Operation 1 - Retrieve student
		Student student = em.find(Student.class, 20001L);
		
		//Persistence Context >> student
		
		//Database Operation 2 - Retrieve passport
		Passport passport = student.getPassport();
		
		//Persistence Context >> student, passport
		
		
		//Database Operation 3 - Update passport
		passport.setNumber("E1234567");
		
		//Persistence Context >> student, passport-updated
		
		
		//Database Operation 3 - Update student
		student.setName("SipiB");;
		
		//Persistence Context >> student-updated, passport-updated
	}//Transaction ends here
	
	//for example 
	public void insertStudentAndCourseHardcoded() {
		Student student = new Student("Franz");
		Course course = new Course("The Idiot Course");
		
		em.persist(student); 
		em.persist(course);
		
		student.addCourse(course);
		course.addStudent(student);
		
		em.persist(student); //persist the owning side 
	}
	
	
	public void insertStudentAndCourse(Student student, Course course) {
		
		student.addCourse(course);
		course.addStudent(student);
		
		em.persist(student); //first persist the owner 
		em.persist(course);
	}
	
	

}
