package com.udemy.in28minutes.spirng.soapcoursemanagement.soap.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM, customFaultCode = "{http://in28minutes.com/courses}001_COURSE_NOT_FOUND") //or u can use the builtin FaultCode.CLIENT
public class CourseNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1069934972829073520L;
	
	public CourseNotFoundException(String arg0) {
		super(arg0);
	}
}
