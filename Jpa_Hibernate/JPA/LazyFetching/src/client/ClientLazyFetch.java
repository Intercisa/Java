package client;

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

        			Student student1 = new Student("2013HG10542", "Harry Page");
        			Student student2 = new Student("2013HG10542", "Harry Page");
        			System.out.println(student1.equals(student2));
        			
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
        			 * 
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
