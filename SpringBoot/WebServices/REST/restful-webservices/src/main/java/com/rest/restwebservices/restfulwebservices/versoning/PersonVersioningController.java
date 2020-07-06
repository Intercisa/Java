package com.rest.restwebservices.restfulwebservices.versoning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	

	//uri versioning
	@GetMapping("/v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	//request parameter versioning 
	@GetMapping(value = "/person/param", params = "version=1" )
	public PersonV1 paramV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(value = "/person/param", params = "version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	
	//--------------------------------------------------------------------------------------------
	
	
	//these two (header - accept header) are called misuse of http header versioning 
	//cashing can be a problem 
	//these two can't be executed from a browser
	
	
	//header versoning or custom 
	@GetMapping(value = "/person/header", headers = "X-API-VERSION=1" ) //header value -> key:X-API-VERSION value:1
	public PersonV1 headerV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(value = "/person/header", headers = "X-API-VERSION=2") //header value -> key:X-API-VERSION value:2
	public PersonV2 headerV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	//accept header versioning or mimetype or content negotiation or media type 
	@GetMapping(value = "/person/produces", produces  = "application/vn.company.app-v1+json" ) //header -> key:Accept - value:application/vn.company.app-v1+json
	public PersonV1 producesV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(value = "/person/produces", produces = "application/vn.company.app-v2+json") //header -> key:Accept - value:application/vn.company.app-v1+json
	public PersonV2 producesV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}
