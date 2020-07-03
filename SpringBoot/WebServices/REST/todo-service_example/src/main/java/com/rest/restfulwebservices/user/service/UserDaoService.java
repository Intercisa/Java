package com.udemy.in28minutes.rest.webservices.restfulwebservices.user.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.udemy.in28minutes.rest.webservices.restfulwebservices.user.bean.User;

@Component
public class UserDaoService {
	
	private static int usersCount = 5;

	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User(1, "Birbi", new Date()));
		users.add(new User(2, "Sipi", new Date()));
		users.add(new User(3, "Timos", new Date()));
		users.add(new User(4, "Zoli", new Date()));
		users.add(new User(5, "Polom", new Date()));
	}
	
	public List<User> findAll(){return users;}
	
	public User save(User user) {
		if(user.getId() == null)
			user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		return users.stream()
				.filter(u -> u.getId() == id)
				.findFirst()
				.orElse(null);
	}	
	
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
	
	
}
