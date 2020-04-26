package com.example.jpa.hibernate.hibernatedemo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.hibernate.hibernatedemo.entity.Course;
import com.example.jpa.hibernate.hibernatedemo.entity.Review;

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


	public void addReviewsForCourse(Long courseId, List<Review> reviews) {
		Course course = findById(courseId);
		
		for (Review review : reviews) {
			course.addReview(review);
			review.setCourse(course);
			em.persist(review);
		}
		
		
	}
	
	
	//only for practice and debug 
	public void addReviewsForCourse_hardcodedExample() {
		//get the course
		Course course = findById(10003L);
		log.info("Reviews ->{}" ,course.getReviews());
		
		//add 2 reviews to it
		Review review1 = new Review("4", "Good Course");
		Review review2 = new Review("5", "Great Course");
		
		//setting the relationship
		course.addReview(review1);
		review1.setCourse(course);
		
		course.addReview(review2);
		review2.setCourse(course);
		
		//save it to the database
		em.persist(review1);
		em.persist(review2);
	}
	
	

}
