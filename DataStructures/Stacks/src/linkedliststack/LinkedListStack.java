package linkedliststack;

import java.util.LinkedList;
import java.util.ListIterator;

import bean.Emplyee;

public class LinkedListStack {
	
	private LinkedList<Emplyee> stack;

	public LinkedListStack() {
		this.stack = new LinkedList<Emplyee>();
	}
	
	public void push(Emplyee e) {
		stack.push(e);
	}
	
	public Emplyee poll() {
		return stack.poll();
	}
	
	public Emplyee peek() {
		return stack.peek();
	}
	
	public int size() {
		return stack.size();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Emplyee> iterator = stack.listIterator();
		while (iterator.hasNext()) 
			System.out.println(iterator.next());
	}

}
