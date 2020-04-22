package com.udemy.in28minutes.rest.webservices.restfulwebservices.helloworld.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"field2"}) //filtering out field 2 in one go 
public class SomeBeanStaticFilter {

	private String staticField1;
	private String staticField2;
	
	
	@JsonIgnore
	private String staticField3; //don't want to send with the response, coz it is a secure file a password or something 
	
	public SomeBeanStaticFilter() {}
	
	public SomeBeanStaticFilter(String field1, String field2, String field3) {
		super();
		this.staticField1 = field1;
		this.staticField2 = field2;
		this.staticField3 = field3;
	}


	public String getField1() {
		return staticField1;
	}


	public void setField1(String field1) {
		this.staticField1 = field1;
	}


	public String getField2() {
		return staticField2;
	}


	public void setField2(String field2) {
		this.staticField2 = field2;
	}


	public String getField3() {
		return staticField3;
	}


	public void setField3(String field3) {
		this.staticField3 = field3;
	}



}
