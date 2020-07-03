package com.udemy.in28minutes.rest.webservices.restfulwebservices.user.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "All details about the user.") //documentation - swagger
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Size(min = 2, message = "Name should have at least 2 characters")
	@ApiModelProperty(notes = "Name should have at least 2 characters") //documentation - swagger
	private String name;
	
	@Past
	@ApiModelProperty(notes = "Birth date should be in the past") //documentation - swagger
	private Date birthData;
	
	@OneToMany(mappedBy = "user") //the name of the filed in Post -> user 
	private List<Post> posts;
	
	protected User() {}

	public User(Integer id, String name, Date birthData) {
		super();
		this.id = id;
		this.name = name;
		this.birthData = birthData;
	}


	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Date getBirthData() {return birthData;}
	public void setBirthData(Date birthData) {this.birthData = birthData;}
	public List<Post> getPosts() {return posts;}
	public void setPosts(List<Post> posts) {this.posts = posts;}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthData=" + birthData + "]";
	}
	
	
	
	

}
