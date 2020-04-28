package com.example.jpa.hibernate.hibernatedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa.hibernate.hibernatedemo.repository.CourseRepository;
import com.example.jpa.hibernate.hibernatedemo.repository.EmployeeRepository;
import com.example.jpa.hibernate.hibernatedemo.repository.StudentRepository;

@Component
public class CourseWholeAppCommandLineRunner implements CommandLineRunner {

	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository courseRepo;

	@Autowired
	StudentRepository studentRepo;
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		//studentRepo.saveStudentWithPassport();	
		//List<Review> reviews = Arrays.asList(new Review("5", "Hats up!"), new Review("5", "So good!"));
		//courseRepo.addReviewsForCourse(10004L, reviews);
		//studentRepo.insertStudentAndCourse(new Student("Franz"), new Course("The Idiot Course"));
		
		/*employeeRepo.insert(
				new FullTimeEmployee("Jack", new BigDecimal("10000")));
		employeeRepo.insert(
				new PartTimeEmployee("Jill",new BigDecimal("50")));*/
		
		//log.info("employees ->{}", employeeRepo.retrieveAllEmployees()); will fail,because @MappedSuperclass in Employee.class -> not an entity anymore
		//log.info("FullTimeEmployee ->{}", employeeRepo.retrieveAllFullTimeEmployees());
		//log.info("PartTimEmployee ->{}", employeeRepo.retrieveAllPartTimEmployees());
	}

}
