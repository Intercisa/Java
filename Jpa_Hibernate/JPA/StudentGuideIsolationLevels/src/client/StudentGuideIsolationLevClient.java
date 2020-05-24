package client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentGuideIsolationLevClient {

	/* 4 level of isolation:
	 * 
	 * SERIALIZABLE >> highest isolation-level >> provides full/complete isolation
	 * serial execution, the transactions must wait for each other 
	 * 
	 * REPEATABLE_READ
	 * on repeated read the user will got the new row inserted from the other users update but not the updated value of an existing row >> phantom read 
	 * 
	 * READ_COMMITED
	 * on repeated read the user will got all the updates from the other users update >>unrepeatable read >> great chance you won't get the same data twice (because of others updating it)
	 * 
	 * READ_UNCOMMITTED >> lowest isolation-level
	 * same result than the READ_COMMITED but! you will see the changes before the other user reach commit, so there is a chance of a rollback!!!!! 
	 * it is possible because of the Dirty Reads >> this is a highly not recommended isolation level!!!
	 * 
	 * not all SQL engine support all four isolation level >> example MySql support all(default:REPEATABLE_READ), but Oracle only support two(SERIALIZABLE, READ_COMMITED(default)) 
	 * 
	 * the lower the isolation-level the better the performance and lesser the data integrity!
	 * 
	 * to read the isolation level: SELECT @@tx_isolation;
	 * from  MYSQL8 -> SELECT @@transaction_isolation;
	 * 
	 * you can alter the isolation level in persistance.xml 
	 * <property name="hibernate.connection.isolation" value="2"/>
	 * 
	 */
	
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
        		try {
        			txn.begin();
        		
        			List<Object[]> resultList =em.createQuery("select guide.name,guide.salary from Guide as guide").getResultList();
        			
        			for (Object[] o : resultList) {
						System.out.println("Name: "+o[0]+" Salary: "+ o[1]);
					}
        			
        			long sumOfSalaries= (long)em.createQuery("select sum(guide.salary) from Guide as guide").getSingleResult();
        			System.out.println("The total salary of all the guides is: "+sumOfSalaries);
        			
        		
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
