package hashtable;

import java.util.NoSuchElementException;

import bean.Emplyee;

// without real hashing strategy

public class SimpleArrayHashtable {

	private final int INIT_CAPACITY = 10; 
	private Emplyee[] hashtable;
	
	SimpleArrayHashtable(){
		hashtable = new Emplyee[INIT_CAPACITY];
	}
	
	public void put(String key, Emplyee emplyee) {
		int hashedKey = hashKey(key);
	 	if(hashtable[hashedKey] != null) System.out.println("This key is already in the position: " + hashedKey +"! rollback[("+ key +")]");
	 	else hashtable[hashedKey] = emplyee;
	}
	
	public Emplyee get(String key) {
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
