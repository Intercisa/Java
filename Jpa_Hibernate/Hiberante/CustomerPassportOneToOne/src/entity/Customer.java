package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_OWNER") //have to rename the table, because hibernate or mysql did not liked the Customer table name, don't know why 
public class Customer {
	
	//owner
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@OneToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "passport_id", unique = true) //if you use "	<property name="hbm2ddl.auto">update</property>" then you have to use unique = true
	private Passport passport;
	
	public Customer() {}
	public Customer(String name, Passport passport) {
		this.name = name;
		this.passport = passport;
	}

	public Passport getPassport() {
		return passport;
	}

}
