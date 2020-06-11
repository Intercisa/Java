package dip;

import java.util.List;

public class Research { //high-level -> operations on low-level modules && it is close to the user 
	
	
	/*
	public Research(Relationships relationships) { //bad because it is depend on a low-level module 
		
		List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
		relations.stream().filter(x -> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT)
		.forEach(ch -> System.out.println("John has a child called: " + ch.getValue2().name));
		
	}
	*/
	
	
	public Research(RelationshipBrowser browser) {
		List<Person> findAllChilderOf = browser.findAllChilderOf("John");
		
		findAllChilderOf.forEach(System.out::println);
	}
}
