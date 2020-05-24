package entity;

import javax.persistence.Embeddable;
//not entity, only a collection of data 
@Embeddable
public class Address {
	private String zipcode;
	private String street;
	private String city;
	
	public Address() {}

	public Address(String zipcose, String street, String city) {
		super();
		this.zipcode = zipcose;
		this.street = street;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Addres(zipcode: "+ zipcode
				+" street: "+ street
				+" city: "+city
				+")";
	}
	

}
