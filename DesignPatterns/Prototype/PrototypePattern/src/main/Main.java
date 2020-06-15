package main;

import org.apache.commons.lang3.SerializationUtils;

import cloneable.Address;
import cloneable.Person;
import copy.Employee;
import serialization.Foo;

/*
 * 
 * Prototype
 * 
 * Don't use Cloneable 
 */

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//cloneable test
		Person john = new Person(new String[] {"John", "Smith"}, new Address("Valton Street", 9));
		
		Person jane = (Person) john.clone(); 
		jane.names[0] = "Jane";
		jane.address.houseNumber = 10;
		
		
		System.out.println(john + "\n" + jane);
		
		System.out.println();
		
		//copy test
		Employee mark = new Employee("Mark", new copy.Address("123","London", "UK"));
		
		Employee chris = new Employee(mark);
		chris.name = "Chris";
		System.out.println(mark + "\n" + chris);
		
		System.out.println();
		
		//serialization test
		
		Foo foo = new Foo(42, "life");
		Foo foo2 = SerializationUtils.roundtrip(foo); // Performs a serialization roundtrip. Serializes and deserializes the given object
		
		foo2.whatever = "xyz";
		
		System.out.println(foo + "\n" + foo2);
		
	}
}
