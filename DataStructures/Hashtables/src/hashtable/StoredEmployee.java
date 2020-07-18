package hashtable;

import bean.Emplyee;

public class StoredEmployee {
	
	public String key;
	public Emplyee emplyee;
	
	public StoredEmployee(String key, Emplyee emplyee) {
		this.key = key;
		this.emplyee = emplyee;
	}

	@Override
	public String toString() {
		return String.format("StoredEmployee [key=%s, emplyee=%s]", key, emplyee);
	}
}
