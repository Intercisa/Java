package jdklist;

import java.util.LinkedList;

import bean.Emplyee;

public class Main {

	public static void main(String[] args) {
		Emplyee jane = new Emplyee("Jane", "Jones", 123);
		Emplyee john = new Emplyee("John", "Doe", 4567);
		Emplyee mary = new Emplyee("Mary", "Smith", 22);
		Emplyee mike = new Emplyee("Mike", "Wilson", 3245);

		LinkedList<Emplyee> list = new LinkedList<Emplyee>();
		
		list.addFirst(jane);
		list.addFirst(john);
		list.addFirst(mary);
		list.addFirst(mike);
		
		
		list.addLast(new Emplyee("Brata", "Bill", 234));
		
		list.forEach(System.out::println);
	}
}
