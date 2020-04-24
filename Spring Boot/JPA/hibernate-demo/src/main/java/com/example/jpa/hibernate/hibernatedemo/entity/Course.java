package com.example.jpa.hibernate.hibernatedemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	protected Course() {}

	public Course(String name) {this.name = name;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Long getId() {return id;}

	@Override
	public String toString() {
		return String.format("\nCourse [id=%s, name=%s]", id, name);
	}

	
	
	
	
}
