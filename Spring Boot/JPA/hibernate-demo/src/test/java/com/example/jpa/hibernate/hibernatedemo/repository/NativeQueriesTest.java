package com.example.jpa.hibernate.hibernatedemo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

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
class NativeQueriesTest {
	
	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	
	//with native queries you have not use a persistence context, 
	//so you need to refresh them is you have them directly in the persistence context, to make them uptodate 
	
	@Autowired
	EntityManager em;
	
	@Test
	void native_queries_basic() {
		Query createQuery = em.createNativeQuery("SELECT * FROM COURSE", Course.class); 
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT * FROM COURSE -> {}", resultList);
	}
	
	@Test
	void nativeQueries_with_parameter() {
		Query createQuery = em.createNativeQuery("SELECT * FROM COURSE WHERE id=?", Course.class); 
		createQuery.setParameter(1, 10001L); //starts from 1 not from 0 
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT * FROM COURSE WHERE id=? -> {}", resultList);
	}
	
	@Test
	void nativeQueries_with_named_parameter() {
		Query createQuery = em.createNativeQuery("SELECT * FROM COURSE WHERE id=:id", Course.class); //:id -> named param, instead of position use name 
		createQuery.setParameter("id", 10001L); //starts from 1 not from 0 
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT * FROM COURSE WHERE id=? -> {}", resultList);
	}
	
	
	//!!! you can't do a mass update trough JPA, that's where we really need native queries !!! 
	 
	
	@Test
	@Transactional //we change the data so we need this - coz' we are not calling a method from repository which is already @Transactional
	void native_queries_to_update() {
		Query createQuery = em.createNativeQuery("UPDATE COURSE SET last_updated_date=sysdate()", Course.class); 
		int numberOfRowsUpdated = createQuery.executeUpdate();
		log.info("UPDATE COURSE SET last_updated_date=sysdate() -> {}", numberOfRowsUpdated);
	}
	
}
