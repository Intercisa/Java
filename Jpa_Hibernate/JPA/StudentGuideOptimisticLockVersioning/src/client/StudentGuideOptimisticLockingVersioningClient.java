package client;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.OptimisticLockException;
import javax.persistence.Persistence;

import entity.Guide;


public class StudentGuideOptimisticLockingVersioningClient {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		
		EntityManager em1 = emf.createEntityManager();
		em1.getTransaction().begin();
		
		Guide guide = em1.find(Guide.class, 2L);
		
		em1.getTransaction().commit();//1st commit >> the first user commit his changes first (yes, there is a second user in cilent2)
		em1.close();
		
		guide.setSalary(4000);
		
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction txn = em2.getTransaction();
		
		try {
		txn.begin();
		
		Guide mergeGuide = em2.merge(guide);
		
		txn.commit();
		
		}catch (OptimisticLockException e) {
			if (txn!=null) {
				txn.rollback();
				System.err.println("The guide updated by some other user while you were doing your update!");
			}
		}finally {
			if(em2!=null) {em2.close();}
		}
		
		/*
		 * thats why we have to do versioning! >> add a new column to the table(Guide.class in this case, so we can track the updates >> Hibernate automatically update if we map it in the class >>  @Version )
		 *hibernate is going to check for the version number at each update 
		 *OptimisticLockException will thrown >> turn this into a message >>handle in the try catch as it seen upper! 
		 *Last Commit Did Not Win >> No Lost Updates!
		 *optimistic locking >> no database locking ! >> prevent Lost Updates when implementing a Conversation (multiple transactions/[request/response cycles])
		 *pessimistic locking >> database locking >>usable only within single transaction
		 */
      

	}

}