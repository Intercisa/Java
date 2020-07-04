package com.rest.restwebservices.restfulwebservices.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rest.restwebservices.restfulwebservices.user.UserNotFoundException;
//Implementing Generic Exception Across the Application

@ControllerAdvice //shared across multiple controller
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {

		var exceptionResponse =
				new ExceptionResponse(
						new Date(),
						ex.getMessage(),
						request.getDescription(false));
		
		return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {

		var exceptionResponse =
				new ExceptionResponse(
						new Date(),
						ex.getMessage(),
						request.getDescription(false));
		
		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
		
	}
	@Override
	public final ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		var exceptionResponse =
				new ExceptionResponse(
						new Date(),
						"validation failed",
						ex.getBindingResult().toString());
		
		return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
		
	}
	
}
