package hashtable;

import java.util.NoSuchElementException;

import bean.Employee;

// without real hashing strategy

public class SimpleArrayHashtable {

	private final int INIT_CAPACITY = 10; 
	private Employee[] hashtable;
	
	SimpleArrayHashtable(){
		hashtable = new Employee[INIT_CAPACITY];
	}
	
	public void put(String key, Employee emplyee) {
		int hashedKey = hashKey(key);
	 	if(hashtable[hashedKey] != null) System.out.println("This key is already in the position: " + hashedKey +"! rollback[("+ key +")]");
	 	else hashtable[hashedKey] = emplyee;
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		if(hashtable[hashedKey] == null) throw new NoSuchElementException();
		
		return hashtable[hashedKey];
		
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}
	
	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) 
			if(hashtable[i] != null) System.out.println(hashtable[i]);
	}
}
