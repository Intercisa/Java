package com.in28minutes.microservices.limitsservice.configcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.configcontroller.bean.LimitConfiguration;
import com.in28minutes.microservices.limitsservice.configproperties.Configuration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
	
	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod = "fallbackRetrieveConfiguration") //if one of your services are going down your full service wont go with it -> with hystrix you can configure a default behavior  
	public LimitConfiguration retrieveConfiguration() {
		throw new RuntimeException("Not Available");
	} 
	
	//if one of your services are going down your full service wont go with it -> with hystrix you can configure a default behavior  
	public LimitConfiguration fallbackRetrieveConfiguration() {
		return new LimitConfiguration(999, 9);
	} 
	
}
