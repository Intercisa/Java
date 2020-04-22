package com.udemy.in28minutes.rest.webservices.restfulwebservices.user.resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.udemy.in28minutes.rest.webservices.restfulwebservices.user.bean.User;
import com.udemy.in28minutes.rest.webservices.restfulwebservices.user.bean.UserNotFountException;
import com.udemy.in28minutes.rest.webservices.restfulwebservices.user.service.UserDaoService;

@RestController
public class UserResource {
	

	
	@Autowired
 	private UserDaoService daoService;
	
	//GET /users
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return daoService.findAll();
	}
	
	//GET /users/{id}
	@GetMapping("users/{id}")
	public Resource<User> retrieveUser(@PathVariable int id) {
		User user = daoService.findOne(id);
		
		if(user == null)
			throw new UserNotFountException("id- " + id);
		
		//HATEOAS
		//"all-users", SERVER_PATH "/users"
		//retrieveAllusers
		//newer version of Spring Boot:
		/*
		EntityModel<User> model = new EntityModel<>(user);
		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllUsers()); //check comment.txt for help 
		model.add(linkTo.withRel("all-users"));
		*/
		
		//older version of Spring Boot:
		Resource<User> resource = new Resource<User>(user);
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllUsers());
		resource.add(linkTo.withRel("all-users"));
		return resource;
		
	}
	
	
	//CREATED
	//input - details of user
	//output - CREATED & Return the created URI
	//POST /users
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) { //whatever we passed in the body of the request will be mapped to the parameter | @Valid - validation API 
		User savedUser = daoService.save(user);
		//return status -> CREATED
		// /users/{id}  from savedUser.getId()
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri(); //append the id
		
		return ResponseEntity.created(location).build(); //returns the location in the HEADER!!
		
	}
	
	
	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable int id) {
		/*
		User user = daoService.deleteById(id);
		if(user == null) {
			throw new UserNotFountException("id- " + id);
			
		}
			*/
		
		if(daoService.deleteById(id) == null)
			throw new UserNotFountException("id- " + id);
			
		
	}
	
	

}
