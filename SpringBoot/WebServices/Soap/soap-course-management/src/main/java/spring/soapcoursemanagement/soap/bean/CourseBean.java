package com.udemy.in28minutes.spirng.soapcoursemanagement.soap.bean;

public class CourseBean {
	private int id;
	private String name;
	private String description;
	
	protected CourseBean() {}
	
	public CourseBean(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
	
}
