package cloneable;

public class Address implements Cloneable {
	
	public String streetname;
	public int houseNumber;
	
	public Address(String streetname, int houseNumber) {
		this.streetname = streetname;
		this.houseNumber = houseNumber;
	}

	@Override
	public String toString() {
		return String.format("Address [streetname=%s, houseNumber=%s]", streetname, houseNumber);
	}
	
	//deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {

		return new Address(streetname, houseNumber);
	}
	
}
