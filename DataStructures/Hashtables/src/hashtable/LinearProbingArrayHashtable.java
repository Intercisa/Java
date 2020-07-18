package hashtable;

import bean.Emplyee;


public class LinearProbingArrayHashtable {

	private final int INIT_CAPACITY = 10; 
	private StoredEmployee[] hashtable;
	
	LinearProbingArrayHashtable(){
		hashtable = new StoredEmployee[INIT_CAPACITY];
	}
	
	public void put(String key, Emplyee emplyee) {
		int hashedKey = hashKey(key);
		
		if(isOccupied(hashedKey)) {
			int stopIndex = hashedKey;
			
			// setting the first probe position
			if(hashedKey == hashtable.length -1) hashedKey = 0;
			else hashedKey++;
			
			while (isOccupied(hashedKey) && hashedKey != stopIndex) 
				hashedKey = (hashedKey+1) % hashtable.length; // because of wrapping
			
		}
	
	 	if(isOccupied(hashedKey)) System.out.println("This key is already in the position: " + hashedKey +"! rollback[("+ key +")]");
	 	else hashtable[hashedKey] = new StoredEmployee(key, emplyee);
	}
	
	public Emplyee get(String key) {
		int hashedKey = findKey(key);
		if(hashedKey == -1) return null;
		
		return hashtable[hashedKey].emplyee;
	}
	
	public Emplyee remove (String key) {
		int hashedKey = findKey(key);
		if(hashedKey == -1) return null;
		
		Emplyee removedEmloyee = hashtable[hashedKey].emplyee;
		hashtable[hashedKey] = null;
		
		// rehashing 
		StoredEmployee[] oldHashtable = hashtable;
		hashtable = new StoredEmployee[hashtable.length];
		for (int i = 0; i < oldHashtable.length; i++) 
			if(oldHashtable[i] != null)
				put(oldHashtable[i].key, oldHashtable[i].emplyee);
		
		return removedEmloyee;
	}

	private int findKey(String key) {
		int hashedKey = hashKey(key);
		if(hashtable[hashedKey] != null &&
				hashtable[hashedKey].key.equals(key)) return hashedKey;
		
		int stopIndex = hashedKey;
			
		// setting the first probe position
		if(hashedKey == hashtable.length -1) hashedKey = 0;
		else hashedKey++;
			
		while (hashedKey != stopIndex &&
				hashtable[hashedKey] != null &&
				!hashtable[hashedKey].key.equals(key)) 
			hashedKey = (hashedKey+1) % hashtable.length; // because of wrapping
		
		return hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key) ? hashedKey : -1;
	}
	
	private boolean isOccupied(int index) {
		return hashtable[index] != null;
	}
	
	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}
	
	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) 
			if(hashtable[i] != null) System.out.println(hashtable[i]);
	}
}
