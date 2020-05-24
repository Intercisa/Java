package client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Guide;
import entity.Student;

public class ClientLazyFetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
        		try {
        			txn.begin();
        			//Equals and Hash Example
        			/*
        			Student student1 = new Student("2013HG10542", "Harry Page");
        			Student student2 = new Student("2013HG10542", "Harry Page");
        			
        			System.out.println(student1.equals(student2));//true
        			System.out.println(student1.hashCode()==student2.hashCode());//true
        			
        			Set<Student> students = new HashSet<Student>();
        			students.add(student1);
        			
        			System.out.println(students.contains(student2));//true
        			
        			List<Student> studentList = new ArrayList<Student>();
        			studentList.add(student1);
        			
        			System.out.println(studentList.contains(student2));//true
        			//all true because we implemented the equals and hash methods
        			 */
        			
        			Student student = em.find(Student.class, 2L);//EagerFetch so we got the associated Guide object as well
        			
        			Guide guide = em.find(Guide.class, 2L);// it will come from the cache, because we already got this object with Student, so it is in the cache 
        			Set<Student> students = guide.getStudents();//no database operation, because LazyFetch
        			
        			System.out.println(students.contains(student));//it will be initialize but only with the objects we have not got in cache >> in this case only Student id=1L
        			/*
        			 * System.out.println(students.contains(student)); >> 
        			 * it will be true anyways Student.class has the equals and hash methods implemented or not, 
        			 * because the EntityManger cached the Student object when we first called >> Student student = em.find(Student.class, 2L);  
        			 * because ManyToOne relationships is by default Eager, so we got the associated Guide object with the Student object as well 
        			 * 
        			 * 
        			 * 
        			 * if we use two different EntityManager and we have not implemented equals and hash then System.out.println(students.contains(student));
        			 * >> won't be true, because cached differently, and there is no equals and hash method 
        			 * 
        			 */
        			 
        			
	        		txn.commit();
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        				if(em != null) { em.close();}
        				
        		}		
	}
	
	public void fetchExample() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
        		try {
        			txn.begin();

        			Guide guide = em.find(Guide.class, 2L); //SQL calling only the Guide table
        			Set<Student> students = guide.getStudents();//still, SQL calling only the Guide table
        			int numberOfStudents = students.size();//SQL calling both the Guide table and the Student table
  
        			/*
        			 * Lazy Collection Fetching
        			 * A collection is fetched when the application invokes an operation upon that collection
        			 * By default collection associations (@OneToMany and @ManyToMany) are lazily fetched
        			 * 
        			 * ALLERT! >> we changed that to FetchType.EAGER in Guide.class to demonstrate the difference 
        			 * commented out so far 
        			 */
        			
        			
        			Student student = em.find(Student.class, 2L);
        			/*
        			 * By default, single point associations (@OneToOne and @ManyToOne) are eagerly fetched!
        			 * If we find a Student object we will give back an associated Guide object as well
        			 * an if we changed the default layz FetchType in Guide (as we do), then we that will gives as back all the associated Student objects as well
        			 * 
        			 * ALLERT! >> we can changed to FetchType.LAZY in Student.class, so we got only the one Student object back 
        			 */
        			
        			
	        		txn.commit();
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        				if(em != null) { em.close();}
        				
        		}		
	}
	
	
}
