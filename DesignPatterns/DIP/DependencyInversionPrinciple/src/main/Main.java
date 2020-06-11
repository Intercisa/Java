package main;

import java.io.IOException;

import dip.Person;
import dip.Relationships;
import dip.Research;

/*
 * 
 * Dip
 * 
 * A. High-level modules should not depend on low-level modules.
 * 	  Both should depend on abstraction.
 * 
 * B. Abstraction should not depend on details.
 * 	  Details should depend on abstraction.
 * 
 */

public class Main {

	public static void main(String[] args) throws IOException {
		Person parent = new Person("John");
		Person child1 = new Person("Chris");
		Person child2 = new Person("Matt");
		
		Relationships relationships = new Relationships();
		relationships.addparentAndChild(parent, child1);
		relationships.addparentAndChild(parent, child2);
		
	
		new Research(relationships);
	
		
		
	}
}
