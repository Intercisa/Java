package circuralqueue;

import bean.Emplyee;

public class Main {

	public static void main(String[] args) {
		CircuralQueue queue = new CircuralQueue(5);
		
		Emplyee jane = new Emplyee("Jane", "Jones", 123);
		Emplyee john = new Emplyee("John", "Doe", 4567);
		Emplyee mary = new Emplyee("Mary", "Smith", 22);
		Emplyee mike = new Emplyee("Mike", "Wilson", 3245);
		Emplyee bill = new Emplyee("Billy", "Bill", 78923);
		
		
		
		queue.push(jane);
		queue.push(john);
		queue.pop();
		queue.push(mary);
		queue.pop();
		queue.push(mike);
		queue.pop();
		queue.push(bill);
		queue.pop();
		queue.push(jane);
		
		printWithSize(queue);

		
	}

	private static void printWithSize(CircuralQueue queue) {
		queue.size();
		queue.printQueue();
	}
}
