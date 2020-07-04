package com.rest.restwebservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


public class User {
	
	private Long id;
	
	@Size(min = 2, message = "must be more than 2 char long")
	private String name;
	
	@Past
	private Date birthDate;
	
	protected User() {}
	
	public User(Long id, String name, Date birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Date getBirthDate() {return birthDate;}
	public void setBirthDate(Date birthDate) {this.birthDate = birthDate;}
	

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
	}
}
