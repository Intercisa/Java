package com.example.angularWithSpringBootRest.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.angularWithSpringBootRest.helloworld.bean.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "hello, World";
	}
	
	@GetMapping("/hello-bean")
	public HelloWorldBean helloBean() {
		return new HelloWorldBean("Hello, World form a bean!");
	}
	
	@GetMapping("/hello-bean/pathvar/{name}")
	public HelloWorldBean helloBeanPathVar(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello, %s form a bean!", name));
	}

}

