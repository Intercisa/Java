package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Message;

public class MessageClient {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Message message = new Message("Hello");//transient state
		
		em.persist(message);//persistent state
		
		em.getTransaction().commit();
		em.close();//once em is closed the message object becomes detached
		
		
		message.setText("Hi");
		
		EntityManager em2 = emf.createEntityManager();
		em2.getTransaction().begin();
		
		Message mergedMessage = em2.merge(message);
		
		em2.getTransaction().commit();
		em2.close();

        
	}
	
	public void simpleJPAPersistingObject() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
        		try {
        			txn.begin();

        			Message msg= new Message("Hello");
        			em.persist(msg);
  
	        		txn.commit();
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        				if(em != null) { em.close();}
        				
        		}		
	}
	
	public void simpleCacheExample() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Message message = em.find(Message.class, 7L); //issue an SQL select >> SELECT ... FROM ... WHERE ...
		Message messageNew = em.find(Message.class, 7L);//does not issue SQL select >> em cache the object >> first-level cache
		
		em.getTransaction().commit();
		em.close();
		
	}
	
	public void secondCacheExample() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em1 = emf.createEntityManager();
		em1.getTransaction().begin();
		Message message1 = em1.find(Message.class, 7L); //issue an SQL select >> SELECT ... FROM ... WHERE ...
		em1.getTransaction().commit();
		em1.close();
		
		//separate entity manager
	
		EntityManager em2 = emf.createEntityManager();
		em2.getTransaction().begin();
		Message message2 = em2.find(Message.class, 7L); //issue an SQL select >> SELECT ... FROM ... WHERE ...
		em2.getTransaction().commit();
		em2.close();
		
	}
	
	
	
}