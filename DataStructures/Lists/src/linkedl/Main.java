package linkedl;

import bean.Emplyee;

public class Main {

	public static void main(String[] args) {

		Emplyee jane = new Emplyee("Jane", "Jones", 123);
		Emplyee john = new Emplyee("John", "Doe", 4567);
		Emplyee mary = new Emplyee("Mary", "Smith", 22);
		Emplyee mike = new Emplyee("Mike", "Wilson", 3245);

		EmployeeLinkedList llist = new EmployeeLinkedList();
		llist.push(jane);
		llist.push(john);
		llist.push(mary);
		llist.push(mike);

		System.out.println(llist.size());

		llist.printList();

		System.out.println(llist.poll());
		
		System.out.println(llist.isEmpty());
		
		System.out.println(llist.size());

		llist.printList();

	}

}
