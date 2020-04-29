package com.example.jpa.hibernate.hibernatedemo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.hibernate.hibernatedemo.HibernateDemoApplication;
import com.example.jpa.hibernate.hibernatedemo.entity.Course;
import com.example.jpa.hibernate.hibernatedemo.entity.Review;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = HibernateDemoApplication.class) //specifying the class we want to launch (use the Application class!!!!)
class CourseRepositoryTest {
	
	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	CourseRepository repository;
	
	@Autowired
	EntityManager em;
	
	@Test
	void findById_basic() {
		assertEquals("The Castle Course", repository.findById(10001L).getName());
	}
	
	@Test
	@DirtiesContext //after the test automatically reset the data, so the other test won't fail 
	void deleteById_basic() {
		repository.deleteById(10002L);
		assertNull(repository.findById(10002L));
	}
	
	@Test
	@DirtiesContext //after the test automatically reset the data, so the other test won't fail 
	void save_basic() {
		assertNotNull(repository.save(new Course("The Cather in The Rye")));
	}

	@Test
	@DirtiesContext //after the test automatically reset the data, so the other test won't fail 
	void save_modest() {
		
		Course course = repository.findById(10001L);
		assertEquals("The Castle Course", course.getName());
		course.setName("Ubik");
		
		repository.save(course);
		
		assertEquals("Ubik", repository.findById(10001L).getName());
	}
	
	@Test
	void playinWithEntityManager() {
		//repository.playingWithEntityManager();
	}
	
	@Test
	@Transactional
	void retrieveReviewsForCourse() {
		Course course = repository.findById(10001L);
		log.info("reviews ->{}", course.getReviews()); //needs @Transactional
	}
	
	@Test
	@Transactional
	void retrieveCourseForReview() {
		Review review = em.find(Review.class, 50001L); //normally you make a ReviewRepository, it's a shortcut to use em 
		log.info("Course ->{}", review.getCourse()); //needs @Transactional
	}
	
	
	
	
}
