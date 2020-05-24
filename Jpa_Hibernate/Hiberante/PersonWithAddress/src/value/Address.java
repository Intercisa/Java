package value;


import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	//@Column(name = "address_street")
	private String street;
	//@Column(name = "address_city")
	private String city;
	//@Column(name = "address_zipcode")
	private String zipcode;
	
	public Address() {}
	
	public Address(String street, String city, String zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}



	@Override
	public String toString() {
		return "Address(street: "+street+" city: "+city+" zipcode: "+zipcode+"]";
	}
	
	

}
