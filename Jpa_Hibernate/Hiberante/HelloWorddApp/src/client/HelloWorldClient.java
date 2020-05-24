package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Message;
import util.HibernateUtil;

public class HelloWorldClient {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		/*
		session.beginTransaction();
		
		Message message = new Message("Hello World with Hibernate Second Edition");
		
		session.save(message);
		
		session.getTransaction().commit();
		session.close();
		*/
		
		Transaction txn = session.getTransaction();
		
		try {
			txn.begin();
			Message msg = (Message)session.get(Message.class, 3L); //3L -> id! 
			//msg.setText("Philip K. Dick - Do Androids Dream of Electric Sheep?"); //altering the object 
			
			session.delete(msg); //deleting object
			
			txn.commit();
			
		} catch (Exception e) {
			if (txn!=null) txn.rollback();
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		

	}

}
