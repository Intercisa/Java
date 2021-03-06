package com.example.jpa.hibernate.hibernatedemo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PreRemove;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//@Table(name = "CourseDetails")  //use if the table have a different name than the entity or you want that 
@NamedQueries(
		value = {@NamedQuery(name = "query_get_all_courses", query = "SELECT c  FROM Course c"),
				@NamedQuery(name = "query_get_all_courses_with_join_fetch", query = "SELECT c  FROM Course c JOIN FETCH c.students s"), //solving N+1 problem with join fetch
				@NamedQuery(name = "query_select_Trial", query = "SELECT c  FROM Course c where name like '%Trial'")})

@Cacheable //adding second level cache 
@SQLDelete(sql = "update course set is_deleted=true where id=?") //soft delete configuration
@Where(clause = "is_deleted = false") //only retrieve those where isDeleted == false || part of soft delete configuration || not applied to native queries!! >> need to add manually 
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(/*name = "fullname",*/ nullable = false)	//specifying the column name in the table | nullable -> hence the name >> good practice specifying this 
	private String name;
	
	@OneToMany(mappedBy = "course") //reverse side of the relationship - lazy by default 
	private List<Review> reviews = new ArrayList<>();
	
	@ManyToMany(mappedBy = "courses")  //dosen't matter which side is the owning side 
	@JsonIgnore
	private List<Student> students = new ArrayList<>();
	
	@UpdateTimestamp //hibernate annotations - no need for getter/setter
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp //hibernate annotations - no need for getter/setter
	private LocalDateTime createdDate;
	
	private boolean isDeleted; //for soft delete 
	
	@PreRemove //called before the row of the specific entity gets deleted || lifecycle method, there are more 
	private void preRemove() {
		isDeleted = true; //needed because hibernate otherwise don't know if it was deleted or not -> coz' soft delete 
	}
	
	protected Course() {}

	public Course(String name) {this.name = name;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Long getId() {return id;}
	public List<Review> getReviews() {return reviews;}
	public void addReview(Review review) {this.reviews.add(review);} //can add only just one review - no real setter method - IMPORTANT! 
	public void removeReview(Review review) {this.reviews.remove(review);}//removes specific review 
	public List<Student> getStudents() {return students;}
	public void addStudent(Student student) {this.students.add(student);}
	public void removeStudents(Student student) {this.students.remove(student);}

	@Override
	public String toString() {
		return String.format("\nCourse [id=%s, name=%s]", id, name);
	}

}
