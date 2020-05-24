package client;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Guide;
import entity.Student;

public class StudentGuideMergeDetachedObj {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em1 = emf.createEntityManager();
		
		//detached object >> in a multi-user environment this would be the case >> life like 
		/*
		em1.getTransaction().begin();
		
		Guide guide = em1.find(Guide.class, 2L);
		Set<Student> students = guide.getStudents();
		int numOfTheStudents = students.size();//initializing the students >> JVM call the data from the database 
		
		Student student = null;
		for (Student nextSt : students) {
			if (nextSt.getId()==1L) 
				student = nextSt;
		}
		
		em1.getTransaction().commit();
		em1.close();
	
		
		
		guide.setSalary(3000);
		student.setName("Amy Jade Lem");//if cascading is turned off in Guide than this won't change in the database, only the Guides salary will  
										//>> use cascade = {CascadeType.MERGE} 
		
		EntityManager em2 = emf.createEntityManager();
		em2.getTransaction().begin();
		
		Guide mergedGuide = em2.merge(guide);
		
		em2.getTransaction().commit();
		em2.close();
		*/
		
		//not detached 
		em1.getTransaction().begin();
		Guide guide = em1.find(Guide.class, 2L);
		Set<Student> students = guide.getStudents();
		int numOfTheStudent = students.size();
		
		Student student = null;
		for (Student nextStu : students) {
			if(nextStu.getId()==1L) student = nextStu;
		}
		em1.getTransaction().commit();
		
		guide.setSalary(3500);
		student.setName("Amy K. Jade Lem");
		
		em1.getTransaction().begin();
		
		//no need for merging this time 
		
		em1.getTransaction().commit();
		em1.close();
		
      

	}

}