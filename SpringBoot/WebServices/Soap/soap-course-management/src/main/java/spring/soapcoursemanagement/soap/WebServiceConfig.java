package com.udemy.in28minutes.spirng.soapcoursemanagement.soap;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.security.xwss.XwsSecurityInterceptor;
import org.springframework.ws.soap.security.xwss.callback.SimplePasswordValidationCallbackHandler;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

//Enabled Spring Web Services -> @EnableWs
//Spring Configuration -> @Configuration

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter{
	//MessageDispatcherServlet
		//ApplicationContext
	//ulr -> /ws/*
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		// mapping messageDispatcherServlet to -> "/ws/* this"
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		
		return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
	}
	
	
	//Spring WebServices creating the WSDL for us 
	// /ws/courses.wsdl
		//PortType - CoursePort
		//Namespace - "http://in28minutes.com/courses"
	// course-details.xsd
	
	@Bean(name = "courses")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema coursesSchema) {
			
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		// set the PortType - CoursePort
		definition.setPortTypeName("CoursePort");
		
		//set the Namespace - "http://in28minutes.com/courses"
		definition.setTargetNamespace("http://in28minutes.com/courses");
		
		//set the URI
		definition.setLocationUri("/ws");
		
		//set the schema
		definition.setSchema(coursesSchema);
		
		return definition;
	}
	
	
	@Bean
	public XsdSchema coursesSchema() {
		return new SimpleXsdSchema(new ClassPathResource("course-details.xsd"));
	}
	
	
	//XwsSecurityInterceptor
	@Bean
	public XwsSecurityInterceptor securityInterceptor() {
	
		XwsSecurityInterceptor securityInterceptor = new XwsSecurityInterceptor();
		
		//Callback Handler -> SimplePasswordValidationCallbackHandler
		securityInterceptor.setCallbackHandler(callbackHandler());
		
		//Security Policy -> sexurityPolicy.xml
		securityInterceptor.setPolicyConfiguration(new ClassPathResource("securityPolicy.xml")); //src/main/resources
		
		return securityInterceptor;
		
	}
	
	@Bean
	public SimplePasswordValidationCallbackHandler callbackHandler() { //import the xwss.XwsSecurityInterceptor;
		SimplePasswordValidationCallbackHandler handler = new SimplePasswordValidationCallbackHandler();
		handler.setUsersMap(Collections.singletonMap("user", "password")); //adding a username:user and a password:password (very simple configuration, only for the example) 
		
		return handler;
	}


	//Interceptors.add -> XwsSecurityInterceptor
	@Override
	public void addInterceptors(List<EndpointInterceptor> interceptors) {
		interceptors.add(securityInterceptor());
	}
	
}
