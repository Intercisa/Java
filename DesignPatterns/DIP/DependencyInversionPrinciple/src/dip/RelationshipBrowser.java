package dip;

import java.util.List;

public interface RelationshipBrowser {
	List<Person> findAllChilderOf(String name);
}
