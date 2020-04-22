package com.udemy.in28minutes.rest.webservices.restfulwebservices.helloworld.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/static-filtering")
	public SomeBeanStaticFilter retrieveSomeBeanStatic() {
		
		SomeBeanStaticFilter someStaticBean = new SomeBeanStaticFilter("value1","value2","value3");		
		return someStaticBean;
	}
	
	@GetMapping("/static-filtering-list")
	public List<SomeBeanStaticFilter> retrieveListOfSomeBeanStatic() {
		return Arrays.asList(new SomeBeanStaticFilter("value0-1","value0-2","value0-3"),
				new SomeBeanStaticFilter("value2-1","value2-2","value2-3"), 
				new SomeBeanStaticFilter("value3-1","value3-2","value3-3"));
	}
	
	
	@GetMapping("/dynamic-filtering")
	public MappingJacksonValue retrieveSomeBeanDynamic() {
		//dynamic filtering
		//only field1, field2
		SomeBeanDynamicFilter someDynamicBean = new SomeBeanDynamicFilter("value1","value2","value3");		
		
		MappingJacksonValue mapping = new MappingJacksonValue(someDynamicBean);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeDynamicBeanFilter", filter);
		
		mapping.setFilters(filters);
		
		return mapping;
	}
	
	@GetMapping("/dynamic-filtering-list")
	public MappingJacksonValue retrieveListOfSomeBeanDynamic() {
		
		List<SomeBeanDynamicFilter> dynamicAsList = Arrays.asList(new SomeBeanDynamicFilter("value0-1","value0-2","value0-3"),
				new SomeBeanDynamicFilter("value2-1","value2-2","value2-3"), 
				new SomeBeanDynamicFilter("value3-1","value3-2","value3-3"));
		
		//dynamic filtering
		//only field2, field3		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeDynamicBeanFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(dynamicAsList);

		
		mapping.setFilters(filters);

		return mapping;
	}
	
	
	
}
