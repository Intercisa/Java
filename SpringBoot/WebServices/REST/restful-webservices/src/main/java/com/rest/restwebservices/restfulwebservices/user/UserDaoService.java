package com.rest.restwebservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	static {
		users.add(new User(1L, "Adam", new Date()));
		users.add(new User(2L, "Eve", new Date()));
		users.add(new User(3L, "Jack", new Date()));
		users.add(new User(4L, "Anna", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		User temp = user;
		if(temp.getId() == null)
			temp.setId(setUserId());
		
		users.add(temp);
		return temp;
	}
	

	public User findOne(Long id) {
		return users.stream()
				.filter(u -> u.getId() == id)
				.findFirst()
				.get();
	}

	private Long setUserId() {
		return users.get(users.size()-1).getId() +1;
	}
	
}
