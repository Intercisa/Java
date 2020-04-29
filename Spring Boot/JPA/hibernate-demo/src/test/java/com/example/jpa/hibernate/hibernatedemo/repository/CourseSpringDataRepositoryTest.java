package com.example.jpa.hibernate.hibernatedemo.repository;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.jpa.hibernate.hibernatedemo.HibernateDemoApplication;
import com.example.jpa.hibernate.hibernatedemo.entity.Course;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = HibernateDemoApplication.class) //specifying the class we want to launch (use the Application class!!!!)
class CourseSpringDataRepositoryTest {
	
	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	CourseSpringDataRepository repository;
	
	
	@Test
	void findById_CoursePresent() {
		Optional<Course> findByIdCourse = repository.findById(10001L);
		assertTrue(findByIdCourse.isPresent());
		log.info("isPresent -> {}", findByIdCourse.isPresent());
	}
	
	@Test
	void findById_CourseNotPresent() {
		Optional<Course> findByIdCourse = repository.findById(90001L);
		assertFalse(findByIdCourse.isPresent());
		log.info("isPresent -> {}", findByIdCourse.isPresent());
	}
	
	@Test
	void playingArundWithSpringDataRepository() {
		//Course course = new Course("Docker Mastery");
		//repository.save(course);
		//course.setName("Docker Mastery - updated");
		//repository.save(course);
		log.info("all courses -> {}  \ncount -> {}", repository.findAll(), repository.count());
	}
	
	@Test
	void sort() {
		Sort sort = Sort.by(Sort.Direction.DESC, "name");
		//Sort sortMultipleCriteria = Sort.by(Sort.Direction.DESC, "name").and(Sort.by("id")); //multiple criteria 
 		log.info("sorted courses -> {}  \ncount -> {}", repository.findAll(sort), repository.count());
	}
	
	@Test
	void pagination() { //divide the result into pages 
		PageRequest pageRequest = PageRequest.of(0, 3);
		
		Page<Course> firstPage = repository.findAll(pageRequest);
 		log.info("courses - first page -> {}", firstPage.getContent());
 		
 		Pageable secondPageable = firstPage.nextPageable();
 		Page<Course> secondPage = repository.findAll(secondPageable);
 		log.info("courses - second page -> {}", secondPage.getContent());
	}
	
	@Test
	void findByName() {
 		log.info("find by name -> {}", repository.findByName("Amerika Course"));
	}
	
	@Test
	void countByName() {
		
		log.info("count by name -> {}", repository.countByName("Amerika Course"));

	}
	
	@Test
	@Transactional
	void deleteByName() {
		repository.deleteByName("Amerika Course");
		Optional<Course> findByIdCourse = repository.findById(10003L);
		assertFalse(findByIdCourse.isPresent());
		log.info("isPresent -> {}", findByIdCourse.isPresent());
		
	}
	
}
