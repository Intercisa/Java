package client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entitiy.Animal;
import entitiy.Cat;
import entitiy.Dog;

public class AnimalInheritanceClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
        		try {
        			txn.begin();
        			/*
        			Cat cat = new Cat();
        			cat.setName("Lucy");
        			
        			Dog dog = new Dog();
        			dog.setName("Oliver");
        			
        			em.persist(cat);
        			em.persist(dog);
        			
        			
        			//a polymophic query
        			
        			 * it is good because a polymorphic queries don't require joins 
        			 * but the bad thing is that all the properties in subclasses must not have not-null constraint 
        			
        			
        			//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
        			Query query = em.createQuery("select animal from Animal animal");
        			List<Animal> animals = query.getResultList();
        			
        			for (Animal a : animals) {
						System.out.println(a);
					}
        			
        			//another query 
        			query = em.createQuery("select dog from Dog dog");
        			List<Dog> dogs = query.getResultList();
        			
        			for (Dog d : dogs) {
						System.out.println(d);
					}
        			 */
        			
        			
        			//@Inheritance(strategy = InheritanceType.JOINED)
        			/*
        			 * poor performance because of the joins the query is needed 
        		
        			Query query = em.createQuery("select animal from Animal animal");
        			List<Animal> animals = query.getResultList();
        			
        			for (Animal a : animals) {
						System.out.println(a);
					}
        		
        			//another query 
        			query = em.createQuery("select dog from Dog dog");
        			List<Dog> dogs = query.getResultList();
        			
        			for (Dog d : dogs) {
						System.out.println(d);
					}
        				*/
        			
        			//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
        			/*should be named TABLE_PER_CONCRETE_CLASS 
        			 * only the concrete classes got their tables(Cat.class, Dog.class), the abstracts are not (Animal.class)  
        			 * //@GeneratedValue(strategy = GenerationType.AUTO)//can't use for InheritanceType.TABLE_PER_CLASS
        			 */
        			
        			//uses union for polymophic queries, so not really a good choice for them 
        			Query query = em.createQuery("select animal from Animal animal");
        			List<Animal> animals = query.getResultList();
        			
        			for (Animal a : animals) {
						System.out.println(a);
					}
        			
        			//Good performance for derived class queries!!
        			query = em.createQuery("select dog from Dog dog");
        			List<Dog> dogs = query.getResultList();
        			
        			for (Dog d : dogs) {
						System.out.println(d);
					}
        			
        			

        			txn.commit();
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        				if(em != null) { em.close();}
        				
        		}		

	}

}
