package com.udemy.in28minutes.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Configuration - @Configuration
//Enable Swagger - @EnableSwagger2

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	  public static final Contact DEFAULT_CONTACT = new Contact(
			  "Sipiczki Barna", 
			  "https://github.com/Intercisa/", 
			  "s******b****@gmail.com");
	  
	  
	  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
			  "Awesome API Title", "Api Documentation", "1.0", 
			  "urn:tos", DEFAULT_CONTACT, 
	          "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",
	          new ArrayList<VendorExtension>());


	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
							new HashSet<String>(Arrays.asList("application/json","application/xml"));


	//There is a bug in newer SpringBoot versions that crushes hateoas, this is the workaround: 
	/*
    @Bean
    public LinkDiscoverers discoverers() {
        List<LinkDiscoverer> plugins = new ArrayList<>();
        plugins.add(new CollectionJsonLinkDiscoverer());
        return new LinkDiscoverers(SimplePluginRegistry.create(plugins));
    }
    */
    //don't need for me right now because I have to downgrate my spring boot version by another bug  
    

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}
	
}
