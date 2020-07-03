package com.example.angularWithSpringBootRest.todos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList();
	private static Long idCounter = 0L;
	
	static {
		
		todos.add(new Todo(++idCounter,"sipi", "Let's Azure NOW!", false, new Date()));
		todos.add(new Todo(++idCounter,"sipi","Become an expert on Spring Boot", false, new Date()));
		todos.add(new Todo(++idCounter,"sipi", "Master Angular", false, new Date()));
		todos.add(new Todo(++idCounter,"sipi","Pro Linux", false, new Date()));
		todos.add(new Todo(++idCounter,"sipi","Professional Docker", false, new Date()));
	    
	}
	
	public List<Todo> retriveAllTodo() {
		return todos;
	}
	
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		
		return todo;
	}
	
	public Todo findById(Long id) {
		
		for (Todo todo : todos) {
			if(todo.getId() == id)
				return todo;
		}
		return null;
	}
	
	
	public Todo deleteById(Long id) {
		Todo todo = findById(id);
		
		if(todo == null) return null;
		if(todos.remove(todo)) {
			return todo;
		}
		return null;
				
	}
		
}
