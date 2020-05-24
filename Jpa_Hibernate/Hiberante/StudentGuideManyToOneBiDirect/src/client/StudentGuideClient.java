package client;


//this is an example for One-to-Many and Many-to-One bidirectional relationship 
//IMPORTANT! Many side in a One-to-Many bidirectional relationship is (almost) always the OWNER side ----> Student.class

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
			
				/*
				Guide guide1 = new Guide("2000MO10789", "Mike LAwson", 10000);
				Guide guide2 = new Guide("2000IM19019", "Ian LAmb", 20000);
				
				Student student1 = new Student("2016IR10198", "Arduino Arnold", guide1);
				Student student2 = new Student("2017IR10321", "Amy Lem", guide1);
				
				guide1.getStudents().add(student1);
				guide1.getStudents().add(student2);
				
				session.persist(guide1);
				session.persist(guide2);
				*/
				
				//session.save(guide);
				//session.save(student); if we don't cascade(in Student.class on Guide) them we have to call save on each
				
				//-----otherwise
				//session.persist(student); //create
						
				//Student student2 = (Student)session.get(Student.class, 2L);
				//session.delete(student2); //delete
				
				
				Guide guide = (Guide) session.get(Guide.class, 2L);
				Student student = (Student)session.get(Student.class, 1L);
				
				//guide.setSalary(2500); own side will update
				//guide.getStudents().add(student); inverse side dose not update the owner without the helper method in Guide.class -> addStudent(Student student)
				
				//student.setGuide(guide); //owner will update the relationship
				
				guide.addStudent(student);//again with the helper method, this way it will update the relationship 
				
				txn.commit();
				
			} catch (Exception e) {
				if (txn!=null) txn.rollback();
				e.printStackTrace();
			}finally {
				if(session!=null)session.close();
			}
			
		}

	}

