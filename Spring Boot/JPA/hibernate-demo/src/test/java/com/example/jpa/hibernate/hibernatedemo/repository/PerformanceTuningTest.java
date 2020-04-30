package com.example.jpa.hibernate.hibernatedemo.repository;

import java.util.List;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.hibernate.hibernatedemo.HibernateDemoApplication;
import com.example.jpa.hibernate.hibernatedemo.entity.Course;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = HibernateDemoApplication.class) //specifying the class we want to launch (use the Application class!!!!)
class PerformanceTuningTest {
	
	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private CourseRepository repository;
	
	@Autowired
	private EntityManager em;
	
	@Test
	@Transactional
	void creating_N_plus_One_problem() { //because Students in Course is @ManyToMany(mappedBy = "courses") and all ...ToMany is lazyFetched! 
		List<Course> courses = em
				.createNamedQuery("query_get_all_courses", Course.class)
				.getResultList();
		
		for (Course course : courses) {
			log.info("Course -> {} Students -> {}", course, course.getStudents());
		}
	}
	
	@Test
	@Transactional
	void solving_N_plus_One_problem_EntityGraph() {
		
		EntityGraph<Course> entityGraph = em.createEntityGraph(Course.class);
		entityGraph.addSubgraph("students");
		
		List<Course> courses = em
				.createNamedQuery("query_get_all_courses", Course.class)
				.setHint("javax.persistence.loadgraph", entityGraph) // this is the SOLUTION! add hint with entityGraph! 
				.getResultList();
		
		for (Course course : courses) {
			log.info("Course -> {} Students -> {}", course, course.getStudents());
		}
	}
	
	@Test
	@Transactional
	void solving_N_plus_One_problemJoinFetch() { 
		List<Course> courses = em
				.createNamedQuery("query_get_all_courses_with_join_fetch", Course.class)
				.getResultList();
		
		for (Course course : courses) {
			log.info("Course -> {} Students -> {}", course, course.getStudents());
		}
	}
	
	
	
	
	

}
