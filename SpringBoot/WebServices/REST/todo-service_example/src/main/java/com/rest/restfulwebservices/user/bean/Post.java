package com.udemy.in28minutes.rest.webservices.restfulwebservices.user.bean;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id ;
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore //otherwise cause an infinite recursion
	private User user;
	
	protected Post() {}

	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public User getUser() {return user;}
	public void setUser(User user) {this.user = user;}

	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description +"]";
	}
	
	
	
	
	
	
}
