package hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

import bean.Employee;

public class ChainedHashtable {

	private static final int INIT_SIZE = 10;
	private LinkedList<StoredEmployee>[] hashTable;
	
	
	public ChainedHashtable() {
		hashTable = new LinkedList[INIT_SIZE];
		for (int i = 0; i < hashTable.length; i++) 
			hashTable[i] = new LinkedList<StoredEmployee>();
	}
	
	public void put(String key, Employee emplyee) {
		int hashedKey = hashKey(key);
		hashTable[hashedKey].add(new StoredEmployee(key, emplyee));
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		StoredEmployee employee = null;
		/*
		ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
		while (iterator.hasNext()) {
			employee = iterator.next();
			if(employee.key.equals(key)) System.out.println(employee);
		}
		*/
		
		employee = hashTable[hashedKey]
				.stream()
				.filter(e -> e.key.equals(key))
				.findFirst()
				.orElse(null);
		
		return employee == null ? null : employee.emplyee;
	}
	
	public Employee remove(String key) {
		int hashedKey = hashKey(key);
		StoredEmployee employee = null;
		ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
		
		int index = -1;
		while (iterator.hasNext()) {
			employee = iterator.next();
			index++;
			if(employee.key.equals(key)) break;
		}
		
		if(employee == null || !employee.key.equals(key)) return null;
		else {
			hashTable[hashedKey].remove(index);
			return employee.emplyee;
		}
	}
	
	private int hashKey(String key) {
		//return key.length() % hashTable.length;
		
		return Math.abs(key.hashCode() % hashTable.length); // Math.abs -> hashCode for String are negative || always % with the length coz it needs to fit in the table 
		
	}
	
	public void printHashtable() {
		for (LinkedList<StoredEmployee> ll : hashTable)
			if(!ll.isEmpty()) ll.stream().forEach(System.out::println);
			else System.out.println("Empty");
	}
}
