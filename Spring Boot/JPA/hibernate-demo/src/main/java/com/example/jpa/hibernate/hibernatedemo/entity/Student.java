package com.example.jpa.hibernate.hibernatedemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Embedded //just embed this in students table 
	private Address address;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Passport passport; //Student is the owning side of the relationship 
	
	@ManyToMany //dosen't matter which side is the owning side, but we choose Student to be the owning side 
	@JoinTable(name = "STUDENT_COURSE",   //costumizing the join tables name 
	joinColumns = @JoinColumn(name="STUDENT_ID"),
	inverseJoinColumns = @JoinColumn(name="COURSE_ID")) 
	private List<Course> courses = new ArrayList<>();
 	
	protected Student() {}
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Long getId() {return id;}
	public Passport getPassport() {return passport;}
	public void setPassport(Passport passport) {this.passport = passport;}
	public List<Course> getCourses() {return courses;}
	public void addCourse(Course course) {this.courses.add(course);}
	public void removeCourse(Course course) {this.courses.remove(course);}
	public Address getAddress() {return address;}
	public void setAddress(Address address) {this.address = address;}

	@Override
	public String toString() {
		return String.format("Student [name=%s]", name);
	}
}
