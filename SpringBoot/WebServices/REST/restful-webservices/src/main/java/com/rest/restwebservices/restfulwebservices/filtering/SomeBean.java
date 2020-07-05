package com.rest.restwebservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

//@JsonIgnoreProperties(value = {"pswd"})
@JsonFilter("SomeBeanFilter")
public class SomeBean{
	
	
	private String firstName;
	private String lastName;
	
	//@JsonIgnore //better because we are not hardcoding the value name  - static filtering 
	private String pswd;

	public SomeBean(String firstName, String lastName, String pswd) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pswd = pswd;
	}

	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	public String getPswd() {return pswd;}
	public void setPswd(String pswd) {this.pswd = pswd;}
}
