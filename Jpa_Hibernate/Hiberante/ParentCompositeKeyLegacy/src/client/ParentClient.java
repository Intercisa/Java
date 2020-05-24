package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Child;
import entity.Parent;
import entity.ParentPrimaryKey;
import util.HibernateUtil;

public class ParentClient {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin();
			
			//persisting
			ParentPrimaryKey parentPrimaryKey = new ParentPrimaryKey("Gavin", "King");
			Parent parent = new Parent(parentPrimaryKey);
			
			
			Child child1 = new Child("Ruby");
			Child child2 = new Child("Groovy");
			
			parent.addChildren(child1, child2); //i'm using varargs here  
			
			session.persist(parent);
			txn.commit();
			
		} catch (Exception e) {
			if (txn!=null) txn.rollback();
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}

	}

}
