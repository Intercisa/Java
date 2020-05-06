package com.example.angularWithSpringBootRest.todos;

import java.util.Date;

public class Todo {
	
	private long id;
	private String username;
	private String description;
	private boolean isDone;
	private Date targetDate;

	protected Todo() {}
	
	public Todo(long id, String username, String description, boolean isDone, Date targetDate) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.isDone = isDone;
		this.targetDate = targetDate;
	}

	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	public String getUsername() {return username;}
	public void setUsername(String username) {this.username = username;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public boolean isDone() {return isDone;}
	public void setDone(boolean isDone) {this.isDone = isDone;}
	public Date getTargetDate() {return targetDate;}
	public void setTargetDate(Date targetDate) {this.targetDate = targetDate;}

}
