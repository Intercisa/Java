package client;



import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Guide;
import entity.Student;
import util.HibernateUtil;

public class StudentGuideClient {

	public static void main(String[] args) {

			
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction txn = session.getTransaction();
			
			try {
				txn.begin();
				Guide guide = new Guide("1020MO10634", "Peter Stevens", 12000);
				Student student = new Student("2016IR10198", "Arduino Arnold", guide);
				
				//session.save(guide);
				//session.save(student); if we don't cascade(in Student.class on Guide) them we have to call save on each
				
				//-----otherwise
				//session.persist(student); //create
						
				Student student2 = (Student)session.get(Student.class, 2L);
				
				session.delete(student2); //delete
				
				txn.commit();
				
			} catch (Exception e) {
				if (txn!=null) txn.rollback();
				e.printStackTrace();
			}finally {
				if(session!=null)session.close();
			}
			
		}

	}

