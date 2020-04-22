package com.udemy.in28minutes.rest.webservices.restfulwebservices.helloworld.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("SomeDynamicBeanFilter") //watch for the name!!
public class SomeBeanDynamicFilter {

	private String dynamicField1;
	private String dynamicField2;
	private String dynamicField3; 
	
	public SomeBeanDynamicFilter() {}
	
	public SomeBeanDynamicFilter(String field1, String field2, String field3) {
		super();
		this.dynamicField1 = field1;
		this.dynamicField2 = field2;
		this.dynamicField3 = field3;
	}


	public String getField1() {
		return dynamicField1;
	}


	public void setField1(String field1) {
		this.dynamicField1 = field1;
	}


	public String getField2() {
		return dynamicField2;
	}


	public void setField2(String field2) {
		this.dynamicField2 = field2;
	}


	public String getField3() {
		return dynamicField3;
	}


	public void setField3(String field3) {
		this.dynamicField3 = field3;
	}



}
