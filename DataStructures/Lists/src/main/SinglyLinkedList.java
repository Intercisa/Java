package main;

public class SinglyLinkedList {

	/*
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Emplyee empHead = new Emplyee("Jane", "Doe", 123, 
				new Emplyee("John", "Doe", 321,
				new Emplyee("David", "Barista", 4532, 
				new Emplyee("Mark", "Manic", 743))));

		Emplyee bill = new Emplyee("Large", "Bill", 8979);
		bill.next = empHead;
		empHead = bill;
		
		while (empHead != null) {
			System.out.println(empHead);
			empHead = empHead.next;
		}

	}

}
