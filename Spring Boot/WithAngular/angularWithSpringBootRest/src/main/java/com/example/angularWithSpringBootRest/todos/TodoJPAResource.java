package com.example.angularWithSpringBootRest.todos;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoJPAResource {
	
	@Autowired
	TodoJpaRepository todoJpaRepo;
	
	@GetMapping("/jpa/users/{username}/todos")
	public List<Todo> getAllTodo(@PathVariable String username){
		return todoJpaRepo.findByUsername(username);
	}
	
	
	@GetMapping("/jpa/users/{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username, @PathVariable long id){
		return todoJpaRepo.findById(id).get();
	}
	
	
	@DeleteMapping("/jpa/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(
			@PathVariable String username, @PathVariable long id) {
		
		todoJpaRepo.deleteById(id);
		
		return ResponseEntity.noContent().build(); //send back a no content status - IMPORTANT 
	}
	
	//Edit/Update a Todo
	//PUT 
	@PutMapping("/jpa/users/{username}/todos/{id}")
	public ResponseEntity<Todo> updateTodo(
			@PathVariable String username, @PathVariable long id, @RequestBody Todo todo){
		
		Todo updatedTodo = todoJpaRepo.save(todo);
		
		return new ResponseEntity<Todo>(todo, HttpStatus.OK);	
	}
	
	
	//POST
	@PostMapping("/jpa/users/{username}/todos") //never leave a '/' on the end of the mapping uri 
	public ResponseEntity<Void> createTodo(
			@PathVariable String username, @RequestBody Todo todo){

		todo.setUsername(username);
		Todo createdTodo = todoJpaRepo.save(todo);
		
		//LOCATION
		//GET current resource url
		///users/{username}/todos/{id}
		
		URI uri = ServletUriComponentsBuilder
		.fromCurrentRequest()
		.path("/{id}")
		.buildAndExpand(createdTodo.getId())
		.toUri();
		
		return ResponseEntity.created(uri).build();	
	}
	
}


