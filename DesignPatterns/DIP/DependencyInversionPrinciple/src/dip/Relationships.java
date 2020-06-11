package dip;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.javatuples.Triplet; //third party class 

public class Relationships implements RelationshipBrowser { //low-level model -> related to data storage 
	
	private List<Triplet<Person, Relationship, Person>>relations = new ArrayList<>();
	
	
	public List<Triplet<Person, Relationship, Person>> getRelations() {
		return relations;
	}

	public void addparentAndChild(Person parent, Person child) {
		relations.add(new Triplet<Person, Relationship, Person>(parent, Relationship.PARENT, child));
		relations.add(new Triplet<Person, Relationship, Person>(child, Relationship.CHILD, parent));
	}

	
	@Override
	public List<Person> findAllChilderOf(String name) {
		return relations.stream()
				.filter(x -> Objects.equals(x.getValue0().name, name) && x.getValue1() == Relationship.PARENT)
				.map(Triplet::getValue2)
				.collect(Collectors.toList());
	}

}