package dip;

public class Person {
	public String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s]", name);
	}
	
	
}
