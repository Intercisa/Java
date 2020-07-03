package com.udemy.in28minutes.rest.webservices.restfulwebservices.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.in28minutes.rest.webservices.restfulwebservices.helloworld.bean.HelloWorldBean;

//Controller
@RestController
public class HelloWorldController {
	//GET
	//URI - /hello-world
	//method - "Hello, World"
	
	@Autowired
	private MessageSource messageSource;

	@GetMapping("/hello-world")
	public String helloWorld() {return "Hello, World!";}
	
	
	//hello-world-bean
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello, World!");
	}
	
	//hello-world/path-variable/"name"
	@GetMapping("/hello-world/pathvariable/{name}")
	public HelloWorldBean helloWorldPathvariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello, %s!", name));
	}
	
	
	
	@GetMapping("/hello-world-internationalized")
	public String helloWorldInternationalized() { //@RequestHeader(name = "Accept-Language", required = false) Locale locale
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
		
	}
	
	
}
