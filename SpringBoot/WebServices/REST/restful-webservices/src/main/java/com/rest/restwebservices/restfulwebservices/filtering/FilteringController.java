package com.rest.restwebservices.restfulwebservices.filtering;

import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	//FirstName, LastName
	@GetMapping("/filtering")
	public MappingJacksonValue retrieveSomeBean() {
		var someBean = new SomeBean("FirstName", "LastName", "Password");

		MappingJacksonValue mapping = createFilter(someBean, "firstName", "lastName");
		return mapping;
	}
	
	//LastName, Password
	@GetMapping("/filtering-list")
	public MappingJacksonValue retrieveListOfSomeBean() {
		var list = List.of(new SomeBean("FirstName-0", "LastName-0", "Password-0"),
				new SomeBean("FirstName-1", "LastName-1", "Password-1"),
				new SomeBean("FirstName-2", "LastName-2", "Password-2"),
				new SomeBean("FirstName-3", "LastName-3", "Password-3"));

		MappingJacksonValue mapping = createFilter(list,"lastName", "pswd");
		
		
		return mapping;
	}
	
	
	private <T> MappingJacksonValue createFilter(T t, String... props) {
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(props);
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(t);
		mapping.setFilters(filters);
		
		return mapping;
		
	}
	
	
}
