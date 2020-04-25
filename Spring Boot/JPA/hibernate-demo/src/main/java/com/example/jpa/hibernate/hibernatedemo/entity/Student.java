package com.example.jpa.hibernate.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToOne
	private Passport passport; //Student is the owning side of the relationship 
	
	protected Student() {}
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Long getId() {return id;}
	public Passport getPassport() {return passport;}
	public void setPassport(Passport passport) {this.passport = passport;}

	@Override
	public String toString() {
		return String.format("Student [name=%s]", name);
	}
	
	

}
