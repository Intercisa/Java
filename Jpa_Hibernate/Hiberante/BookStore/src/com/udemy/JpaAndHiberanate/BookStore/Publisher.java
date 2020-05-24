package com.udemy.JpaAndHiberanate.BookStore;


public class Publisher {
	private String code;
	private String name;
	
	public Publisher() {}

	public Publisher(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	
	
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Publisher[code= "+ code + ", name= "+ name+"]";
	}
	

}
