package com.example.jpa.hibernate.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
 * @Inheritance(strategy =
 * Single Table is good for a performance perspective, but bad in a table management perspective (lots of null) - OK solution ->performance
 * 
 * Table Per Class is can be better for a table management perspective but there is repetition of columns - design trouble - not a good option really 
 * 
 * Joined not as good from a performance perspective, but it's can be a really clear solution for inheritance - joins - OK solution -> data integrity 
 * 
 *  @MappedSuperclass -> annotation can be mapped in the same way as an entity except that the  - not a good option really 
 * 						 mappings will apply only to its subclasses since no table 
 * 						 exists for the mapped superclass itself
 * 				details stored in different tables, and no Employee entity present (not an entity)
 * 
 * used them based on the scenario
 * 
 * */
import javax.persistence.MappedSuperclass;

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "EmployeeType") //naming the new column in Single_Table
@MappedSuperclass //a Mapped Super Class can't be an Entity!!! 
public abstract class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	protected Employee() {}

	public Employee(String name) {this.name = name;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Long getId() {return id;}
	

	@Override
	public String toString() {
		return String.format("\nEmployee [name=%s]", name);
	}

}
