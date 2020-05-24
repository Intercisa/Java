package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Customer;
import entity.Passport;
import util.HibernateUtil;

public class CustomerPassportClient {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin();
			
			Passport passport = new Passport("954307472");
			Customer customer = new Customer("Nicole Jane",passport);
			
			session.persist(customer);
			
			txn.commit();

			
		} catch (Exception e) {
			if (txn!=null) txn.rollback();
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}

	}

}
