package com.example.jpa.hibernate.hibernatedemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String rating;

	private String description;
	
	protected Review() {}
	
	public Review(String rating, String description) {
		super();
		this.rating = rating;
		this.description = description;
	}

	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public Long getId() {return id;}
	public String getRating() {return rating;}
	public void setRating(String rating) {this.rating = rating;}

	@Override
	public String toString() {
		return String.format("Review [rating=%s, description=%s]",rating, description);
	}
	
	


}
