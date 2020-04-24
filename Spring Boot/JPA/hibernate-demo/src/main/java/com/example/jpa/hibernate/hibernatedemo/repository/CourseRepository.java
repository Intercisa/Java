package com.example.jpa.hibernate.hibernatedemo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.hibernate.hibernatedemo.entity.Course;

@Repository
@Transactional
public class CourseRepository {
	
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
	

}
