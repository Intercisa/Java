package copy;

public class Employee {

	public String name;
	public Address address;

	public Employee(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	//copy constructor
	public Employee(Employee other) {
		name = other.name;
		address = new Address(other.address);
	}

	@Override
	public String toString() {
		return String.format("Employee [name=%s, address=%s]", name, address);
	}

}
