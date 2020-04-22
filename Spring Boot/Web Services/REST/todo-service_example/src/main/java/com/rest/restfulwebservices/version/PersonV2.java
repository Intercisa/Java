package com.udemy.in28minutes.rest.webservices.restfulwebservices.version;

public class PersonV2 {
	private Name name;
	
	private PersonV2() {}

	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {return name;}
	public void setName(Name name) {this.name = name;}
	
}
