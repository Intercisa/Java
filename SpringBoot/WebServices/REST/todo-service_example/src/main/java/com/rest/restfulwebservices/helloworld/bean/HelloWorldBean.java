package com.udemy.in28minutes.rest.webservices.restfulwebservices.helloworld.bean;

public class HelloWorldBean {

	
	private String message;
	
	protected HelloWorldBean() {}
	
	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {return message;}
	public void setMessage(String message) {this.message = message;}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}
	
	
	
	

}
