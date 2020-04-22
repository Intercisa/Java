package com.udemy.in28minutes.rest.webservices.restfulwebservices.user.bean;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFountException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotFountException(String arg0) {
		super(arg0);
	}
	
	
	
	
}
