package com.rest.restwebservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "HELLO WORLD!";
	}
	
	@GetMapping("/helloWorldBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("HELLO WORLD BEAN");
	}
	
	@GetMapping("/helloWorldBean/path-variable/{name}")
	public HelloWorldBean helloWorldBeanParam(@PathVariable String name) {
		return new HelloWorldBean("HELLO WORLD "+ name);
	}
	
	@GetMapping("/helloWorldInternationalized")
	public String helloWorldInternationalized() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
		
	}
	
	
	
}
