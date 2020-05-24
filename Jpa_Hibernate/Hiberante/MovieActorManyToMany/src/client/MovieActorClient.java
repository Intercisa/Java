package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Actor;
import entity.Movie;
import util.HibernateUtil;

public class MovieActorClient {

	public static void main(String[] args) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction txn = session.getTransaction();
			try {
				txn.begin();
				/*
				Movie movie1 = new Movie("American Hustle");
				Movie movie2 = new Movie("The Prestige");
				
				Actor actor1 = new Actor("Christian Bale");
				Actor actor2 = new Actor("Hugh Jackman");
				
				movie1.getActors().add(actor1);
				
				movie2.getActors().add(actor1);
				movie2.getActors().add(actor2);
				
				session.persist(movie1);
				session.persist(movie2);
				
				---------------------
				Movie movie = (Movie) session.get(Movie.class, 1L);
				Actor actor = (Actor) session.get(Actor.class, 2L);
				
				actor.getMovies().add(movie); //updating the inverse end won't get us any result
				*/
				
				Movie movie = (Movie) session.get(Movie.class, 1L);
				Actor actor = (Actor) session.get(Actor.class, 2L);
				movie.getActors().add(actor); //updating the owner will work!
		
				txn.commit();
				
			} catch (Exception e) {
				if (txn!=null) txn.rollback();
				e.printStackTrace();
			}finally {
				if(session!=null)session.close();
			}

		}
	}
