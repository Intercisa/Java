package hashtable;

import bean.Employee;

public class StoredEmployee {
	
	public String key;
	public Employee emplyee;
	
	public StoredEmployee(String key, Employee emplyee) {
		this.key = key;
		this.emplyee = emplyee;
	}

	@Override
	public String toString() {
		return String.format("StoredEmployee [key=%s, emplyee=%s]", key, emplyee);
	}
}
