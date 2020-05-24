package client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;

public class StudentGuidePessimisticClient {
	/*
	 * use pessimistic locking when you've got multiple database queries being executed on the same data, within a single transactions
	 * example: pick multiple Guide >> update their salaries than print out the total of all guide salary  
	 * 
	 */

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		@SuppressWarnings("unchecked")
		List<Object[]> resuList = em.createQuery("select guide.name,guide.salary from Guide as guide")
				.setLockMode(LockModeType.PESSIMISTIC_WRITE) //pessimistic lock use write is you wan't to update the data like in this case >> see down
				.getResultList();
		//also you can use just PESSIMISTIC_READ than others can read the data but they can't update it!
		
		for (Object[] o : resuList) {
			System.out.println("Name: "+ o[0]+" Salary: "+ o[1]);
		}
		
		long sumOfSalaries = (long)em.createQuery("select sum(guide.salary) from Guide guide").getSingleResult(); //there will be a time lag! 
		System.out.println("The total salary of all the guides is: "+ sumOfSalaries);
		
		em.createQuery("update Guide as guide set guide.salary = guide.salary*4").executeUpdate();
		
		em.getTransaction().commit();
		em.close();
		

	}

}
