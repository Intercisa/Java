package com.rest.restwebservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
				.orElseThrow(() -> new UserNotFoundException("id-"+ id));
	}
	
	
	public User deleteByUser(Long id) {
//		return users.remove(
//				users.stream()
//		.filter(u -> u.getId() == id)
//		.findFirst()
//		.orElse(null));
		
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

	private Long setUserId() {
		return users.get(users.size()-1).getId() +1;
	}
	
}
