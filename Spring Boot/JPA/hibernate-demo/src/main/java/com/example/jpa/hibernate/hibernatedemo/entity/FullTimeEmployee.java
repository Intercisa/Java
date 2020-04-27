package com.example.jpa.hibernate.hibernatedemo.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class FullTimeEmployee  extends Employee{

	private BigDecimal salary;
	
	public FullTimeEmployee() {}

	
	public FullTimeEmployee(String name, BigDecimal hourlyWage) {
		super(name);
		this.salary = hourlyWage;
	}


	public BigDecimal getHourlyWage() {return salary;}
	public void setHourlyWage(BigDecimal hourlyWage) {this.salary = hourlyWage;}
	
	
	
}
