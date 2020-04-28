package com.example.jpa.hibernate.hibernatedemo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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
class CriteriaQueryTest {
	
	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	void select_all_courses_criteriaquery_basic() {
		//CriteriaQuery - SELECT c  FROM Course c
		
		//1. Use Criteria Builder to create a Criteria Query returning the expected result
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class); //that's the same part as >> FROM Course c
		
		//3. Define Predicates etc using Criteria Builder
			//don't have any now
		
		//4. Add Predicates etc to the Criteria Query
			//don't have any now
		
		//5. Build the TypedQuery using the entity manager and criteria query
		TypedQuery<Course> createQuery = em.createQuery(cq.select(courseRoot));
		List<Course> resultList = createQuery.getResultList();
		log.info("CriteriaQuery -> {}", resultList);
	}
	
	@Test
	void select_all_courses_having_the_criteriaquery_basic() {
		//CriteriaQuery - SELECT c  FROM Course c WHERE name LIKE 'The%'
		
		//1. Use Criteria Builder to create a Criteria Query returning the expected result
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class); //that's the same part as >> FROM Course c
		
		//3. Define Predicates etc using Criteria Builder
		Predicate likeThe = cb.like(courseRoot.get("name"), "The%");
		
		//4. Add Predicates etc to the Criteria Query
		cq.where(likeThe);
		
		
		//5. Build the TypedQuery using the entity manager and criteria query
		TypedQuery<Course> createQuery = em.createQuery(cq.select(courseRoot));
		List<Course> resultList = createQuery.getResultList();
		log.info("CriteriaQueryThe% -> {}", resultList);
	}
	
	@Test
	void select_all_courses_without_students_criteriaquery_basic() {
		//CriteriaQuery - SELECT c  FROM Course c where c.students is empty
		
		//1. Use Criteria Builder to create a Criteria Query returning the expected result
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class); //that's the same part as >> FROM Course c
		
		//3. Define Predicates etc using Criteria Builder
		Predicate studentsIsEmpty = cb.isEmpty(courseRoot.get("students"));
		
		//4. Add Predicates etc to the Criteria Query
		cq.where(studentsIsEmpty);
		
		//5. Build the TypedQuery using the entity manager and criteria query
		TypedQuery<Course> createQuery = em.createQuery(cq.select(courseRoot));
		List<Course> resultList = createQuery.getResultList();
		log.info("studentsIsEmpty -> {}", resultList);
	}
	
	@Test
	void join_criteriaquery_basic() {
		//CriteriaQuery - SELECT c  FROM Course c JOIN c.students s
		
		//1. Use Criteria Builder to create a Criteria Query returning the expected result
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class); //that's the same part as >> FROM Course c
		
		//3. Define Predicates etc using Criteria Builder
		Join<Object, Object> join = courseRoot.join("students");
		
		//4. Add Predicates etc to the Criteria Query

		
		//5. Build the TypedQuery using the entity manager and criteria query
		TypedQuery<Course> createQuery = em.createQuery(cq.select(courseRoot));
		List<Course> resultList = createQuery.getResultList();
		log.info("join -> {}", resultList);
	}
	
	@Test
	void left_join_criteriaquery_basic() {
		//CriteriaQuery - SELECT c  FROM Course c LEFT JOIN c.students s
		
		//1. Use Criteria Builder to create a Criteria Query returning the expected result
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class); //that's the same part as >> FROM Course c
		
		//3. Define Predicates etc using Criteria Builder
		Join<Object, Object> join = courseRoot.join("students", JoinType.LEFT);
		
		//4. Add Predicates etc to the Criteria Query
		
		
		//5. Build the TypedQuery using the entity manager and criteria query
		TypedQuery<Course> createQuery = em.createQuery(cq.select(courseRoot));
		List<Course> resultList = createQuery.getResultList();
		log.info("leftJoin -> {}", resultList);
	}
	
	
	
}
