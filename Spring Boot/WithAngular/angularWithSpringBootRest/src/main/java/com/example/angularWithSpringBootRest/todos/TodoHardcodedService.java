package com.example.angularWithSpringBootRest.todos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList();
	private static int idCounter = 0;
	
	static {
		todos= Arrays.asList(
		new Todo(++idCounter,"sipi", "Let's Azure!", false, new Date()),
	    new Todo(++idCounter,"sipi","Become an expert on Spring Boot", false, new Date()),
	    new Todo(++idCounter,"sipi", "Master Angular", false, new Date()),
	    new Todo(++idCounter,"sipi","Pro Linux", false, new Date()),
	    new Todo(++idCounter,"sipi","Professional Docker", false, new Date())
	    );	
	}
	
	public List<Todo> retriveAllTodo() {
		return todos;
	}
	
	

}
