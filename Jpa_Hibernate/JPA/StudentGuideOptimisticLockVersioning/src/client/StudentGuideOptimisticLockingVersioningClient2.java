package client;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Guide;
import entity.Student;

public class StudentGuideOptimisticLockingVersioningClient2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em1 = emf.createEntityManager();
		em1.getTransaction().begin();
		Guide guide = em1.find(Guide.class, 2L);
		em1.getTransaction().commit(); //2nd commit 
		em1.close();
		
		
		guide.setSalary(4500);
		
		EntityManager em2 = emf.createEntityManager();
		em2.getTransaction().begin();
		
		Guide mergeGuide = em2.merge(guide);
		
		em2.getTransaction().commit();//3rd commit >> this user commit his changes quicker, than the another user, thats why his changes will persist and not this >> LAST COMMIT WINS! 
		em2.close();
		
		
		
      

	}

}