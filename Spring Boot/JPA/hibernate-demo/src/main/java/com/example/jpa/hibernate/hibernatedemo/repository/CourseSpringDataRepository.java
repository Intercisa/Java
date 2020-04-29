package com.example.jpa.hibernate.hibernatedemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.jpa.hibernate.hibernatedemo.entity.Course;

@RepositoryRestResource(path = "courses") //RestResourse!!!! 
public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {
		List<Course> findByName(String name); //you can name it with find or query or retrieve -> findByName || queryByName || retrieveByName
		List<Course> findByNameOrderById(String name);//you can sort the result 
		List<Course> findByNameOrderByIdDesc(String name);//you can sort the result in desc order
		List<Course> findByNameAndId(String name, Long id); //you can use two parameters 
		void deleteByName(String name); 
		int countByName(String name); 
		
		
		@Query("SELECT c  FROM Course c")
		List<Course> allCourses();
		
		@Query(value = "SELECT c  FROM Course c", nativeQuery = true)
		List<Course> allCoursesUsingNativeQuery();
		
		@Query(name = "query_get_all_courses")
		List<Course> allCoursesUsingNamedQuery();
		
}		

