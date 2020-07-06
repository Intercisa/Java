package com.rest.restwebservices.restfulwebservices.user;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rest.restwebservices.restfulwebservices.post.Post;
import com.rest.restwebservices.restfulwebservices.post.PostReopsitory;
 

@RestController
public class UserJpaResource {

	@Autowired
	UserJpaRepository userRepo;
	
	@Autowired
	PostReopsitory postRepo;
	
	
	@GetMapping("/jpa/users")
	public List<User> retriveAllUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> retriveUser(@PathVariable Long id){
		User user = userRepo.findById(id).get();
		
		EntityModel<User> resource = EntityModel.of(user);
		
		WebMvcLinkBuilder linkTo = 
				WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retriveAllUsers());
		
		resource.add(linkTo.withRel("all-users"));
		
		
		return resource;
	}
	
	@PostMapping("/jpa/users")
	public ResponseEntity<?> createUser(@Valid @RequestBody User user) {
		
		User savedUser = userRepo.save(user);
		
		var location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		
		return ResponseEntity.created(location)
		.build();
	}
	
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		userRepo.deleteById(id);
	}
	
	
	
	//posts
	
	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> retieveAllPostFromUser(@PathVariable Long id){
		var user = userRepo.findById(id);
		if(!user.isPresent()) throw new UserNotFoundException("not found");
		
		return user.get().getPosts();
	}
	
	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<?> createPostForUser(@PathVariable Long id, @RequestBody Post post){
		var user = userRepo.findById(id);
		if(!user.isPresent()) throw new UserNotFoundException("not found");
		
		post.setUser(user.get());
		postRepo.save(post);
	
		
		var location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(post.getId())
				.toUri();
		
		return ResponseEntity.created(location)
		.build();
	}

	
}
