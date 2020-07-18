package queue;

import bean.Emplyee;

public class Main {

	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(4);
		
		Emplyee jane = new Emplyee("Jane", "Jones", 123);
		Emplyee john = new Emplyee("John", "Doe", 4567);
		Emplyee mary = new Emplyee("Mary", "Smith", 22);
		Emplyee mike = new Emplyee("Mike", "Wilson", 3245);
		Emplyee bill = new Emplyee("Billy", "Bill", 78923);
		
		
		queue.push(jane);
		queue.push(john);
		queue.push(mary);
		queue.push(mike);
		queue.pop();
		//System.out.println(queue.peek());
		queue.push(bill);
		
		printWithSize(queue);
	}

	private static void printWithSize(ArrayQueue queue) {
		queue.size();
		queue.printQueue();
	}
}
