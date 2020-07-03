package com.example.jpa.hibernate.hibernatedemo.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee  extends Employee{

	private BigDecimal hourlyWage;
	
	public PartTimeEmployee() {}

	
	public PartTimeEmployee(String name, BigDecimal hourlyWage) {
		super(name);
		this.hourlyWage = hourlyWage;
	}


	public BigDecimal getHourlyWage() {return hourlyWage;}
	public void setHourlyWage(BigDecimal hourlyWage) {this.hourlyWage = hourlyWage;}
	
	
	
}
