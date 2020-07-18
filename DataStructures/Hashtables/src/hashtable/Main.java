package hashtable;

import bean.Emplyee;

public class Main {

	public static void main(String[] args) {

		Emplyee jane = new Emplyee("Jane", "Jones", 123);
		Emplyee john = new Emplyee("John", "Doe", 4567);
		Emplyee mary = new Emplyee("Mary", "Smith", 22);
		Emplyee mike = new Emplyee("Mike", "Wilson", 3245);
		Emplyee bill = new Emplyee("Billy", "Bill", 78923);
		
		//SimpleArrayHashtable hashtable = new SimpleArrayHashtable();
		LinearProbingArrayHashtable hashtable = new LinearProbingArrayHashtable();
		
		hashtable.put("Jones", jane);
		hashtable.put("Doe", john);
		hashtable.put("Wilson", mike);
		hashtable.put("Smith", mary);
		
		
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
	}
}
