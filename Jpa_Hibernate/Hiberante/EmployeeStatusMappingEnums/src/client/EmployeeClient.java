package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Employee;
import entity.EmplyeeStatus;
import util.HibernateUtil;

public class EmployeeClient {
	public static void main(String[] args) {
		
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction txn = session.getTransaction();
	try {
		txn.begin();
		//persisting
		/*
		Employee employee1 = new Employee("Josh Stocknam", "2014JA11001", EmplyeeStatus.FULL_TIME);
		Employee employee2 = new Employee("Ammie Corriol", "2014AI21543", EmplyeeStatus.PART_TIME);
		Employee employee3 = new Employee("Ernie Stenseth", "2014ET25100", EmplyeeStatus.CONTRACT);
		
		session.persist(employee1);
		session.persist(employee2);
		session.persist(employee3);
		*/
		
		//retrieving
		Employee employee = (Employee) session.get(Employee.class, 2L);
		System.out.println(employee);
		
		txn.commit();
		
	} catch (Exception e) {
		if (txn!=null) txn.rollback();
		e.printStackTrace();
	}finally {
		if(session!=null)session.close();
	}

}
}

