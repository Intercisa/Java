package entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import value.Address;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "street", column = @Column(name = "home_street")),
		@AttributeOverride(name = "city", column = @Column(name = "home_city")),
		@AttributeOverride(name = "zipcode", column = @Column(name = "home_zipcode"))
	})
	private Address homeAddress;
	
	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "street", column = @Column(name = "billing_street")),
		@AttributeOverride(name = "city", column = @Column(name = "billing_city")),
		@AttributeOverride(name = "zipcode", column = @Column(name = "billing_zipcode"))
	})
	private Address billingAddress;
	
	public Person() {}

	public Person(String name, Address homeAddress, Address billingAddress) {
		super();
		this.name = name;
		this.homeAddress = homeAddress;
		this.billingAddress = billingAddress;
	}
	
	@Override
	public String toString() {
		return "Person[id= "+id+" name= "+ name +" HomeAddress= "+homeAddress+" BillingAddress= "+billingAddress+"]";
	}
	
	
	

}
