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

		Course course2 = findById(10002L);
		course2.setName("The Trial - updated");
	}
	
	

}
