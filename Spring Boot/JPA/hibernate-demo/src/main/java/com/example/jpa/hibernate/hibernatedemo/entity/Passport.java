package com.example.jpa.hibernate.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String number;
	
	protected Passport() {}
	
	public Passport(String number) {
		super();
		this.number = number;
	}

	public String getNumber() {return number;}
	public void setNumber(String number) {this.number = number;}
	public Long getId() {return id;}

	
	@Override
	public String toString() {
		return String.format("Passport [number=%s]", number);
	}
	
	

	
	
}
