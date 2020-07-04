package com.rest.restwebservices.restfulwebservices.post;

import com.rest.restwebservices.restfulwebservices.user.User;

public class Post {
	private Long id ;
	private String description;
	
	private User user;
	
	protected Post() {}

	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public User getUser() {return user;}
	public void setUser(User user) {this.user = user;}

	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description +"]";
	}
}
