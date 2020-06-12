package faceted;

public class PersonAddressBuilder  extends PersonBuilder{ //this is critical 
	
	public PersonAddressBuilder(Person person) {
		this.person = person;
	}
	
	public PersonAddressBuilder at(String streetAddress) {
		person.streetAddress = streetAddress;
		return this;
	}
	
	public PersonAddressBuilder withPostcode(String postcode) {
		person.postcode = postcode;
		return this;
	}
	
	public PersonAddressBuilder in(String city) {
		person.city = city;
		return this;
	}

}
