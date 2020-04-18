package com.udemy.in28minutes.spirng.soapcoursemanagement.soap.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.udemy.in28minutes.spirng.soapcoursemanagement.soap.bean.CourseBean;

@Component
public class CourseDetailsService {
	
	public enum StatusBean {
		SUCCESS, FAILURE;
	}

	private static List<CourseBean> courses = new ArrayList<CourseBean>();
	
	static {
		
		CourseBean course1 = new CourseBean(1, "Spring", "10 steps");
		courses.add(course1);
		CourseBean course2 = new CourseBean(2, "Spring MVC", "10 Example");
		courses.add(course2);
		CourseBean course3 = new CourseBean(3, "Spring Boot", "6k Students");
		courses.add(course3);
		CourseBean course4 = new CourseBean(4, "Maven", "Most popular course on internet");
		courses.add(course4);
		
		
	}
	
	//get course details - 1
	//finfById(int id) -> return a Course 
	
	//get all courses details 
	//List<Course> findAll()
	
	//delete a course 
	//deleteById(int id)
	
	//updating & create a new course 
	
	public CourseBean findbyId(int id) {
		return courses.stream()
		.filter(c -> c.getId() == id)
		.findAny().orElse(null);
	}
	
	public List<CourseBean> findAll(){
		return courses;
	}
	
	
	public StatusBean deleteById(int id) {
		Iterator<CourseBean> iterator = courses.iterator();
		while (iterator.hasNext()) {
			CourseBean course = iterator.next();
			if (course.getId() == id) {
				iterator.remove();
				return StatusBean.SUCCESS;
			}
		}
		return StatusBean.FAILURE;
	}
	
	
}
