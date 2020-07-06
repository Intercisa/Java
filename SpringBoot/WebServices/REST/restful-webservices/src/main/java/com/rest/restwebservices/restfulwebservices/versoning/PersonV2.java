package com.rest.restwebservices.restfulwebservices.versoning;

public class PersonV2 {
	private Name name;

	public PersonV2() {}
	
	public PersonV2(Name name) {
		this.name = name;
	}
	
	public Name getName() {return name;}
	public void setName(Name name) {this.name = name;}

	@Override
	public String toString() {
		return String.format("PersonV2 [name=%s]", name);
	}
}
