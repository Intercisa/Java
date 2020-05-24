package client;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Guide;
import entity.Student;


public class StudentGuideQueryClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
        		try {
        			txn.begin();
        			
        			//!!don't include students in Guide.class for the toString method because that will cause an stack overflow error while query is happening 

        			
        			Query query = em.createQuery("select guide.name, guide.salary from Guide guide");
        			List<Object[]> resultList = query.getResultList();
        			
        			for (Object[] o : resultList) {
						System.out.println("object[0]: "+o[0] + " " +"object[1]: "+ o[1]);
					}
        			System.out.println("------------------------");
        			
        			String name = "Ian LAmb";//simulating dynamic parameter great security issue, use named parameter 
        			query = em.createQuery("select guide from Guide guide where guide.name='"+name+"'");
        			Guide guide = (Guide) query.getSingleResult();
        			
        			System.out.println(guide);
        			
        			System.out.println("------named parameter---------");
        			
        			//named parameter:
        			query = em.createQuery("select guide from Guide guide where guide.name=:name");
        			query.setParameter("name", "Ian LAmb");
        			guide = (Guide) query.getSingleResult();
        			
        			System.out.println(guide);
        			
        			System.out.println("------------------------");
        			
        			guide = (Guide) em.createQuery("select guide from Guide guide where guide.name=:name")
        							.setParameter("name", name)
        							.getSingleResult();
        			
        			System.out.println(guide);
        			
        			System.out.println("-------Wildcards--------");
        			//Wildcards for search for a particular pattern
        			query = em.createQuery("select guide from Guide guide where guide.name like 'M%'");
        			List<Guide> guides = query.getResultList();
        			for (Guide g : guides) {
						System.out.println(g);
					}
        			System.out.println("------native qurey---------");
        			//you can use native qureys if you want
        			query = em.createNativeQuery("select * from guide", Guide.class);
        			guides = query.getResultList();
        			for (Guide g : guides) {
        				System.out.println(g);
					}
        			
        			/*
        			System.out.println("------named qurey---------");
        			//named qureys
        			guides = em.createNamedQuery("findByGuide")
        					.setParameter("name", name)
        					.getResultList();
        			for (Guide g : guides) {
        				System.out.println(g);
					}
					*you need for this an xml named orm.xml in the META-INF folder with the specifications 
        			*/
        			System.out.println("------ aggregate ---------");
        			//count
        			query = em.createQuery("select count(guide) from Guide guide");
        			Long numOfGuides = (Long) query.getSingleResult();
        			System.out.println(numOfGuides);
        			
        			
        			//max
        			query = em.createQuery("select max(guide.salary) from Guide guide");
        			Integer maximumSalary = (Integer) query.getSingleResult();
        			System.out.println(maximumSalary);
        			
        			
        			System.out.println("------ joining associations ---------");
        			
        			query = em.createQuery("select student from Student student join student.guide guide");
        			List<Student> students = query.getResultList();
        			
        			for (Student student : students) {
						System.out.println(student);
					}
        			
        			//left join
        			query = em.createQuery("select student from Student student left join student.guide guide");
        			students = query.getResultList();
        			
        			for (Student student : students) {
						System.out.println(student);
					}
        			
        			//different fetching without changing the entities fetchtype 
        			query = em.createQuery("select guide from Guide guide fetch join guide.student student");
        			guides = query.getResultList();
        			
	        		txn.commit();
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        				if(em != null) { em.close();}
        				
        		}		

	}

}
