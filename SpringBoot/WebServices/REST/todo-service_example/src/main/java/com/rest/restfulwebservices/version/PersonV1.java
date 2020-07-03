package com.udemy.in28minutes.rest.webservices.restfulwebservices.version;

public class PersonV1 {
	private String name;
	
	private PersonV1() {}
	
	public PersonV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
}
