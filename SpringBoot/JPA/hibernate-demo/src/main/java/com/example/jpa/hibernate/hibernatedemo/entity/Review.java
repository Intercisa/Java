package com.example.jpa.hibernate.hibernatedemo.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review { //one side of the OneToMany relationship - owner side 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)   //default -> ordinal >> numeric representation 1,2,3... >> ordinal can change if you add new >> better using EnumType.STRING
	private ReviewRating rating;

	private String description;
	
	@ManyToOne //lazy by deafult 
	private Course course;
	
	protected Review() {}
	
	public Review(ReviewRating rating, String description) {
		super();
		this.rating = rating;
		this.description = description;
	}

	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public Long getId() {return id;}
	public ReviewRating getRating() {return rating;}
	public void setRating(ReviewRating rating) {this.rating = rating;}
	public Course getCourse() {return course;}
	public void setCourse(Course course) {this.course = course;}
	
	@Override
	public String toString() {
		return String.format("Review [rating=%s, description=%s]",rating, description);
	}
	
	


}
