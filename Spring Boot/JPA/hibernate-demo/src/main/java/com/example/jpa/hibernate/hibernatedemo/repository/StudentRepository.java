package com.example.jpa.hibernate.hibernatedemo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	
	public void saveStudentWithPassport() {
		Passport passport = new Passport("Z123456");//create passport
		em.persist(passport);						//persist passport
		
		Student student = new Student("Balage"); //create student
												
		student.setPassport(passport);			//establish relationship	
		em.persist(student);					//persist student
	}
	
	
	public void deleteById(Long id) {
		Student student = findById(id);
		em.remove(student);
	}
	

}
