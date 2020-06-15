package copy;

public class Address {
	public String streetAddress, city, country;

	public Address(String streetAddress, String city, String country) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
	}
	
	//copy constructor
	public Address(Address other) {
		this(other.streetAddress, other.city, other.country);
	}
	
	

	@Override
	public String toString() {
		return String.format("Address [streetAddress=%s, city=%s, country=%s]", streetAddress, city, country);
	}
	
}
