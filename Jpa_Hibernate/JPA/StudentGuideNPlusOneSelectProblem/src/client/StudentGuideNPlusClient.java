package client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.annotations.BatchSize;

import entity.Guide;
import entity.Student;

public class StudentGuideNPlusClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
        		try {
        			txn.begin();
        		
        			/*
        			Query query = em.createQuery("select student from Student student"); 
        			 * n+1 select
        			 * student is eagerly fetched because by default single point associations (ManyToOne) are eagerly fetched, so we will got the associated guide tables as well
        			 * which is n+1 >> one is for the students and n plus for the associated data 
        		
        			List<Student> students = query.getResultList();
        			
        			for (Student st : students) {
						//System.out.println(st);
						//if(st.getGuide()!=null)
						//System.out.println(st.getName()+" "+st.getEnrollmentId()+ " "+ st.getGuide()); //the n+1 problem came back, so we have to write the query differently
					}
        			
        			query = em.createQuery("select student from Student student left join fetch student.guide"); //!!! left join fetch !!!
        				students = query.getResultList();
        			
        			for (Student st : students) {;
						if(st.getGuide()!=null)
						System.out.println(st.getName()+" "+st.getEnrollmentId()+ " "+ st.getGuide()); //the n+1 problem came back, so we have to write the query differently
					}
        			
        		
        			 * !!!!!
        			 * these works only if you have a rather small table, if it is huge, than you go back to eager because that will break the query to small queries, so they won't be a problem 
        			 * !!!!!
        			 * or batch fetching
        			
        			
        			//Batch fetching >> see in Guide.class
        			pretend we have more than 10 000 students
        			all student have one guide 
        			
        			 */
        			Query query = em.createQuery("select student from Student student"); 
        			List<Student> students = query.getResultList();
        			
        			for (Student st : students) {
        				if(st.getGuide()!=null)
						System.out.println(st.getName()+" "+st.getEnrollmentId()+ " "+ st.getGuide()); //each student will bring his associated guide object as well 
					}
        			/*10 000 select statement +1 >> n+1 problem 
        			 * we have to give the @BatchSize(size = n) in Guide.class to initialize not one, but n proxy in every select statement >> 10 000/n selects
        			 * it is coming in the hibernate package!!!
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
