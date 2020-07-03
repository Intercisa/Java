package com.example.jpa.hibernate.hibernatedemo.entity;

import javax.persistence.Embeddable;

@Embeddable //use this when you don't want to establish a difficult relationship between an other entity and Address, just want to embed in their table 
public class Address {
	
	private String line1;
	private String line2;
	private String city;
	
	protected Address() {}
	
	public Address(String line1, String line2, String city) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
	}
	
	

}
