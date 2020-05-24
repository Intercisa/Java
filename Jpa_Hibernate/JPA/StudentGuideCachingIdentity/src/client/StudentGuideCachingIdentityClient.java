package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Guide;

/*
 * A Cache is ID Based!!!
 * not just the first level cache but the second level cache as well
 * 
 * first level cache make sure you don't ends up multiple copies form the same object form a particular database 
 * 
 * first level cache will always be REPEATABLE_READ even if the isolation level is lower than that!!
 */


public class StudentGuideCachingIdentityClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
        		try {
        			txn.begin();
        			
        			Guide guide1= em.find(Guide.class, 2L);
        			Guide guide2 = em.find(Guide.class, 2L);//won't make another select statement, it will come from the first level cache 
        			
        			Guide guide3 = (Guide) em.createQuery("select guide from Guide guide where guide.id=:id")
        					.setParameter("id", 2L)
        					.getSingleResult(); //will make another select statement, because hibernate don't know there is already an object of this in the cache,only the entity manager knows that 
        										//than it goes to the first level cache as a reference, because there can be only one of the same object >> one object in the cache and three reference in this case what we ends up  
             		txn.commit();
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        		
        			if(em != null)  em.close();
        			//IMPORTANT!!!!!! FUCKING IMPORTANT!!!!
        			if(emf.isOpen()) emf.close(); //if the program won't terminate, than you have to use this, but use anyway just to be sure!!
        				
        		}		
	}

}