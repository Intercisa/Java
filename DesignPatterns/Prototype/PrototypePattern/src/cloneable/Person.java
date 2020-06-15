package cloneable;

import java.util.Arrays;

public class Person implements Cloneable {

	public String[] names;
	public Address address;
	
	public Person(String[] names, Address address) {
		this.names = names;
		this.address = address;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return String.format("Person [names=%s, address=%s]",
				names != null ? Arrays.asList(names).subList(0, Math.min(names.length, maxLen)) : null, address);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
			
		//return new Person(names, address); wrong >> both are reference type so we just copy the reference 
		return new Person(
				names.clone(),
				(Address)address.clone()); 
		
		
	}
}
