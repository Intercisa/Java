package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Person;
import util.HibernateUtil;
import value.Address;

public class PersonClient {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		
		try {
			txn.begin();
			Address homeAddress = new Address("200 E Main St", "Seattle","85123");
			Address billingAddress = new Address("201 E Upper St", "Seattle","85651");
			
			Person person = new Person("Ruby", homeAddress, billingAddress);
			
			session.save(person);
			
			txn.commit();
			
		} catch (Exception e) {
			if (txn!=null) txn.rollback();
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		
		

	}

}
