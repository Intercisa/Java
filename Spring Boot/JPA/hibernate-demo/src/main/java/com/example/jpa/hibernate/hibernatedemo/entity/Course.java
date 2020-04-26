package com.example.jpa.hibernate.hibernatedemo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
//@Table(name = "CourseDetails")  //use if the table have a different name than the entity or you want that 
@NamedQueries(
		value = {@NamedQuery(name = "query_get_all_courses", query = "SELECT c  FROM Course c"),
				@NamedQuery(name = "query_select_Trial", query = "SELECT c  FROM Course c where name like '%Trial'")})


public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(/*name = "fullname",*/ nullable = false)	//specifying the column name in the table | nullable -> hence the name >> good practice specifying this 
	private String name;
	
	@OneToMany(mappedBy = "course") //reverse side of the relationship - lazy by default 
	private List<Review> reviews = new ArrayList<>();
	
	
	@UpdateTimestamp //hibernate annotations - no need for getter/setter
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp //hibernate annotations - no need for getter/setter
	private LocalDateTime createdDate;
	
	protected Course() {}

	public Course(String name) {this.name = name;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Long getId() {return id;}
	public List<Review> getReviews() {return reviews;}
	public void addReview(Review review) {this.reviews.add(review);} //can add only just one review - no real setter method - IMPORTANT! 
	public void removeReview(Review review) {this.reviews.remove(review);}//removes specific review 
	
	@Override
	public String toString() {
		return String.format("\nCourse [id=%s, name=%s]", id, name);
	}

	
	
	
	
}
