package doublelinkedl;

import bean.Emplyee;

public class Main {

	public static void main(String[] args) {
		Emplyee jane = new Emplyee("Jane", "Jones", 123);
		Emplyee john = new Emplyee("John", "Doe", 4567);
		Emplyee mary = new Emplyee("Mary", "Smith", 22);
		Emplyee mike = new Emplyee("Mike", "Wilson", 3245);
		
		EmplyeeDoubleLinkedList list = new EmplyeeDoubleLinkedList();
		list.push(jane);
		list.push(john);
		list.push(mary);
		list.push(mike);
		
		
		//printWithSize(list);
		
		Emplyee bill = new Emplyee("Brata", "Bill", 123);
		list.pushToTail(bill);
		
		/*
		printWithSize(list);
		
		list.poll();
		
		printWithSize(list);
		
		list.pollFromTail();
		
		printWithSize(list);
		
		*/
		
		list.addBefore(new Emplyee("TEST", "TEST", 000), john);
		
		printWithSize(list);
		
		
		
	}

	private static void printWithSize(EmplyeeDoubleLinkedList list) {
		System.out.println(list.size());
		list.printList();
	}
}
