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
import com.example.jpa.hibernate.hibernatedemo.entity.Student;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = HibernateDemoApplication.class) //specifying the class we want to launch (use the Application class!!!!)
class JPQLTest {
	
	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EntityManager em;
	
	@Test
	void select_all_JPQL_basic() {
		Query createQuery = em.createQuery("SELECT c  FROM Course c"); //normal query
		List resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c -> {}", resultList);
	}
	
	
	@Test
	void select_all_typed_JPQL_basic() { //typed is better 
		TypedQuery<Course> createQuery = em.createQuery("SELECT c  FROM Course c", Course.class); //typed query
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c -> {}", resultList);
	}
	
	
	@Test
	void select_all_namedQurey_basic() {
		TypedQuery<Course> createQuery = em.createNamedQuery("query_get_all_courses", Course.class);
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c -> {}", resultList);
	}
	
	
	@Test
	void select_where_JPQL_basic() { //that's better 
		TypedQuery<Course> createQuery = em.createQuery("SELECT c  FROM Course c where name like '%Trial'", Course.class); //typed
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c where name like '%Trial' -> {}", resultList);
	}
	
	@Test
	void select_where_NamedQurey_basic() { 
		TypedQuery<Course> createQuery = em.createNamedQuery("query_select_Trial", Course.class); //typed
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c where name like '%Trial' -> {}", resultList);
	}
	
	@Test
	void select_courses_with_no_students_JPQL_basic() { 
		TypedQuery<Course> createQuery = em.createQuery("SELECT c  FROM Course c where c.students is empty", Course.class); //typed || student is the name of the variable in Course.class
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c where c.students is empty -> {}", resultList);
	}
	
	@Test
	void select_courses_with_at_least_2_students_JPQL_basic() { 
		TypedQuery<Course> createQuery = em.createQuery("SELECT c  FROM Course c where size(c.students) >= 2", Course.class); 
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c where size(c.students) >= 2 -> {}", resultList);
	}
	
	@Test
	void select_courses_ordered_by_students_JPQL_basic() { 
		TypedQuery<Course> createQuery = em.createQuery("SELECT c  FROM Course c ORDER BY SIZE(c.students)", Course.class); 
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c order by size(c.students) -> {}", resultList);
	}
	
	@Test
	void select_courses_ordered_by_students_descending_JPQL_basic() { 
		TypedQuery<Course> createQuery = em.createQuery("SELECT c  FROM Course c ORDER BY SIZE(c.students) DESC", Course.class); 
		List<Course> resultList = createQuery.getResultList();
		log.info("SELECT c  FROM Course c order by size(c.students) descending -> {}", resultList);
	}
	
	//LIKE IN JPQL
	@Test
	void select_students_with_passports_certain_pattern_JPQL_like() { 
		TypedQuery<Student> createQuery = em.createQuery("SELECT s FROM Student s WHERE s.passport.number LIKE '%1234%'", Student.class); 
		List<Student> resultList = createQuery.getResultList();
		log.info("SELECT s FROM Student s WHERE s.passport.number LIKE '%1234%' -> {}", resultList);
	}
	
	//JOIN IN JPQL - courses without a student won't show up 
	@Test
	void select_students_and_courses_JPQL_join() { 
		Query createQuery = em.createQuery("SELECT c, s FROM Course c JOIN c.students s"); //can't be a typed query (multiple classes used)
		List<Object[]> resultList = createQuery.getResultList(); //the results are arrays of Objects -> Object[]
		log.info("SELECT c, s FROM Course c JOIN c.student s >> result size-> {}", resultList.size());
		for (Object[] result : resultList) {
			log.info("Course {} Student {}", result[0], result[1]);
		}
	}
	
	//LEFT JOIN IN JPQL - courses without a student will show up
	@Test
	void select_students_and_courses_JPQL_left_join() { 
		Query createQuery = em.createQuery("SELECT c, s FROM Course c LEFT JOIN c.students s"); //can't be a typed query (multiple classes used)
		List<Object[]> resultList = createQuery.getResultList(); //the results are arrays of Objects -> Object[]
		log.info("SELECT c, s FROM Course c LEFT JOIN c.student s >> result size-> {}", resultList.size());
		for (Object[] result : resultList) {
			log.info("Course {} Student {}", result[0], result[1]);
		}
	}
	
	//CROSS JOIN IN JPQL - just write all cross find -> combine all from the first table with all from the second table 
	@Test
	void select_students_and_courses_JPQL_cross_join() { 
		Query createQuery = em.createQuery("SELECT c, s FROM Course c, Student s"); //can't be a typed query (multiple classes used)
		List<Object[]> resultList = createQuery.getResultList(); //the results are arrays of Objects -> Object[]
		log.info("SELECT c, s FROM Course c, Student s >> result size-> {}", resultList.size());
		for (Object[] result : resultList) {
			log.info("Course {} Student {}", result[0], result[1]);
		}
	}
}
