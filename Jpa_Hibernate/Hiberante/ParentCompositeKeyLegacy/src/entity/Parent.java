package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Parent {

	@EmbeddedId
	private ParentPrimaryKey key;
	
	@OneToMany(mappedBy = "parent", cascade = {CascadeType.PERSIST})
	private Set<Child> children;
	
	public Parent() {}
	public Parent(ParentPrimaryKey key) {
		this.key = key;
		children = new HashSet<Child>();
	}
	
	public void addChildren(Child... child) {
		Set<Child> temp = new HashSet<Child>();
		for (Child ch : child) {
			ch.setParent(this);
			temp.add(ch);
		}
		this.children.addAll(temp);
	}
	
	
}
