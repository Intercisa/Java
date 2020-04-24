package com.example.jpa.hibernate.hibernatedemo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.hibernate.hibernatedemo.entity.Course;

@Repository
@Transactional
public class CourseRepository {
	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	@PersistenceContext
	EntityManager em;
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	
	
	public Course save(Course course) {
		if(course.getId()==null)
			em.persist(course);	 //if id == null -> insert
		else 
			em.merge(course);	//else -> update
			
		return course;
	}
	
	
	public void deleteById(Long id) {
		Course course = findById(id);
		em.remove(course);
	}
	
	
	public void playingWithEntityManager() {
		
		Course course = new Course("The Myth of Sisyphus");
		em.persist(course);
		Course course2 = new Course("A Country Doctor");
		em.persist(course2);
		
		
		em.flush(); //synchronize the database with our changes so far -> inserts them in them in the database
		
		
		//em.detach(course2);//Clear the persistence context, causing all managed entities to become detached.
		//em.clear(); //detach every entities 
		
		course.setName("A Happy Death");
		course2.setName("Before the Law");
		
		//em.refresh(course);//refresh the entity content from the database, so delete our changes 
		
		
		em.flush();
		
		/*
		 * as long you are in transaction and you manage something with entityManager 
		 * the changes will kept tracked by entityManager as long you are in the transaction 
		 */
	}
	
	

}
