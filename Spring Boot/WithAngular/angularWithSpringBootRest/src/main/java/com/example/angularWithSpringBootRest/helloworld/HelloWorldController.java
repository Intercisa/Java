package com.example.angularWithSpringBootRest.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200")  //allow request from other domains  (need this if example your frontend and backend on a different server, so basically always)
@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "hello, World";
	}
	
	//@CrossOrigin(origins = "http://localhost:4200") //if you want you can specify CrossOrigin directly on a method 
	@GetMapping("/hello-bean")
	public HelloWorldBean helloBean() {
		return new HelloWorldBean("Hello, I'm from a bean!");
		//throw new RuntimeException("Some Error has Happened! Contact Support at ***-***"); 
	}
	

	@GetMapping("/hello-bean/pathvar/{name}")
	public HelloWorldBean helloBeanPathVar(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello %s, form a bean!", name));
	}

}

