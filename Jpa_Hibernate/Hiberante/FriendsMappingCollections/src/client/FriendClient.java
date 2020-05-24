package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Address;
import entity.Friend;
import util.HibernateUtil;

public class FriendClient {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin();
			
			//persisting
			/*
			Friend friend= new Friend("Mark Anderson", "markanderson@pluswhere.com");
			
			friend.getNickNames().add("Marky");
			friend.getNickNames().add("Marco");
			friend.getNickNames().add("Markster");
			
			Address address = new Address("2400ST", "Main", "Orlando");
			
			friend.getAddresses().add(address);
			
			session.persist(friend);
			*/
			
			//retrieving
			
			Friend friend = (Friend) session.get(Friend.class, 1L);
			System.out.println(friend);
			
			
			txn.commit();
			
		} catch (Exception e) {
			if (txn!=null) txn.rollback();
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}

	}

	}

