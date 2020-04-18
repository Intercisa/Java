package com.udemy.in28minutes.spirng.soapcoursemanagement.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.DeleteCourseDetailsRequest;
import com.in28minutes.courses.DeleteCourseDetailsResponse;
import com.in28minutes.courses.GetAllCourseDetailsRequest;
import com.in28minutes.courses.GetAllCourseDetailsResponse;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;
import com.udemy.in28minutes.spirng.soapcoursemanagement.soap.bean.CourseBean;
import com.udemy.in28minutes.spirng.soapcoursemanagement.soap.exception.CourseNotFoundException;
import com.udemy.in28minutes.spirng.soapcoursemanagement.soap.service.CourseDetailsService;
import com.udemy.in28minutes.spirng.soapcoursemanagement.soap.service.CourseDetailsService.StatusBean;

@Endpoint
public class CourseDetailsEndpoint {
	
	
	@Autowired 
	CourseDetailsService service;
	
	//method
	//input - GetCourseDetailsRequest
	//output - GetCourseDetailsResponse
	
	
	//request comes using this namespace -> http://in28minutes.com/courses process to this -> GetCourseDetailsRequest
	@PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetCourseDetailsRequest")
	@ResponsePayload //convert the response back to xml 
	public GetCourseDetailsResponse proccessCousreDetailsRequest(
			@RequestPayload GetCourseDetailsRequest request) { //@RequestPayload -> convert the request xml to this class
		
		CourseBean course = service.findbyId(request.getId());
		
		if (course == null) {
			throw new CourseNotFoundException("Invalid Course id" + request.getId());
		}
		
		return mapCourseDetails(course);

	}


	@PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetAllCourseDetailsRequest")
	@ResponsePayload //convert the response back to xml 
	public GetAllCourseDetailsResponse proccessAllCousreDetailsRequest(
			@RequestPayload GetAllCourseDetailsRequest request) { //@RequestPayload -> convert the request xml to this class
		List<CourseBean> courses = service.findAll();
	
		return mapAllCourseDetails(courses);
	}
	
	
	@PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "DeleteCourseDetailsRequest")
	@ResponsePayload //convert the response back to xml 
	public DeleteCourseDetailsResponse deleteCousreDetailsRequest(
			@RequestPayload DeleteCourseDetailsRequest request) { //@RequestPayload -> convert the request xml to this class
		
		StatusBean status = service.deleteById(request.getId());
	
		DeleteCourseDetailsResponse response = new DeleteCourseDetailsResponse();
		response.setStatus(mapStatus(status));

		return response;
	}
	
	
	private GetCourseDetailsResponse mapCourseDetails(CourseBean course) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		
		CourseDetails courseDetails = mapCourse(course);
		
		response.setCourseDetails(courseDetails);
		
		return response;
	}
	
	
	private GetAllCourseDetailsResponse mapAllCourseDetails(List<CourseBean> courses) {
		GetAllCourseDetailsResponse response = new GetAllCourseDetailsResponse();
		
		for (CourseBean course : courses) {
			CourseDetails mapCourse = mapCourse(course);
			response.getCourseDetails().add(mapCourse);
		}

		return response;
	}
	
	
	private com.in28minutes.courses.Status mapStatus(StatusBean status) {
		//these are not the same ENUMS, one is from our service, and the other is a class produced my the xml binder 
		return status == 
				StatusBean.FAILURE?com.in28minutes.courses.Status.FAILURE : com.in28minutes.courses.Status.SUCCESS;
		
		/*
		 * if (status == Status.FAILURE)
			return com.in28minutes.courses.Status.FAILURE;
			return com.in28minutes.courses.Status.SUCCESS; 
		 */
	}
	
	private CourseDetails mapCourse(CourseBean course) {
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(course.getId());
		courseDetails.setName(course.getName());
		courseDetails.setDescription(course.getDescription());
		return courseDetails;
	}
	
	
}
