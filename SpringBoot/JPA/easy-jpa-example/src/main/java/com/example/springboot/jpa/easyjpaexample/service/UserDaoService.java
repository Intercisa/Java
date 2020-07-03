package com.example.springboot.jpa.easyjpaexample.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.springboot.jpa.easyjpaexample.entity.User;

@Repository
@Transactional
public class UserDaoService {
	
	/*
	 * User sipi = new User("Sipi", "Admin");
	 * 
	 * User birbi = new User("Birbi", "Admin")
	 * 
	 * entitiyManager.persist(sipi);
	 * 
	 *PersistenceContext Context
	 *
	 *sipi.setRole("User");
	 *birbi.setRole("User");
	 * 
	 */
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Long insert(User user) {
		
		//open transaction
		entityManager.persist(user);
		//close transaction
		
		return user.getId();
	}
	
	
}
