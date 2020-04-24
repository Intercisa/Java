package com.example.jpa.hibernate.hibernatedemo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.jpa.hibernate.hibernatedemo.HibernateDemoApplication;
import com.example.jpa.hibernate.hibernatedemo.entity.Course;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = HibernateDemoApplication.class) //specifying the class we want to launch (use the Application class!!!!)
class JPQLTest {
	
	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	void selectAll_JPQLbasic() {
		Query createQuery = em.createQuery("SELECT c  FROM Course c"); //normal query
		List resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c -> {}", resultList);
	}
	
	@Test
	void selectAllTyped_JPQLbasic() { //that's better 
		TypedQuery<Course> createQuery = em.createQuery("SELECT c  FROM Course c", Course.class); //typed query
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c -> {}", resultList);
	}
	
	
	@Test
	void selectWhere_JPQLbasic() { //that's better 
		TypedQuery<Course> createQuery = em.createQuery("SELECT c  FROM Course c where name like '%Trial'", Course.class); //typed
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c where name like '%Trial' -> {}", resultList);
	}
	
	
	
	
}
