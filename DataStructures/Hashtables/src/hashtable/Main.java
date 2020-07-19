package hashtable;

import java.util.HashMap;
import java.util.Iterator;

import bean.Employee;

public class Main {

	public static void main(String[] args) {

		Employee jane = new Employee("Jane", "Jones", 123);
		Employee john = new Employee("John", "Doe", 4567);
		Employee mary = new Employee("Mary", "Smith", 22);
		Employee mike = new Employee("Mike", "Wilson", 3245);
		Employee bill = new Employee("Billy", "Bill", 78923);
		
		// JDK ---
		
		HashMap<String, Employee> map = new HashMap<String, Employee>();
		map.put("Jones", jane);
		map.put("Doe", john);
		map.put("Smith", mary);
		
		
		Iterator<Employee> iterator = map.values().iterator();
		while (iterator.hasNext()) 
			System.out.println(iterator.next());	
		
		
		map.forEach((k,v) -> System.out.println(v));
		
		
		/*
		//SimpleArrayHashtable hashtable = new SimpleArrayHashtable();
		//LinearProbingArrayHashtable hashtable = new LinearProbingArrayHashtable();
		ChainedHashtable hashtable = new ChainedHashtable();
		
		hashtable.put("Jones", jane);
		hashtable.put("Doe", john);
		hashtable.put("Wilson", mike);
		hashtable.put("Smith", mary);
	
		System.out.println(hashtable.remove("Doe"));
		System.out.println(hashtable.remove("Jones"));
		System.out.println(hashtable.get("Smith"));
		
		//hashtable.printHashtable();
		
		
		
		hashtable.printHashtable();
		
		System.out.println("----------------------------");
		
		System.out.println("retrieve: Wilson - "+ hashtable.get("Wilson"));
		System.out.println("retrieve: Mary - "+ hashtable.get("Smith"));
		
		hashtable.remove("Wilson");
		hashtable.remove("Jones");
		
		System.out.println("----------------------------");
		
		hashtable.printHashtable();
		System.out.println("----------------------------");
		
		System.out.println("retrieve: Mary - "+ hashtable.get("Smith"));
		*/
	}
}