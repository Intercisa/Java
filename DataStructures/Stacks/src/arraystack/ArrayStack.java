package arraystack;

import java.util.EmptyStackException;

import bean.Emplyee;

public class ArrayStack {
	
	private Emplyee[] stack;
	private int top;
	
	
	public ArrayStack(int capacity) {
		stack = new Emplyee[capacity];
	}
	
	public void push(Emplyee employee) {
		if(top == stack.length) {
			// need resize the array
			Emplyee[] newArray = new Emplyee[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		stack[top++] = employee;
	}

	public Emplyee pop() {
		if(isEmpty()) throw new EmptyStackException();
		
		Emplyee poppedEmploye = stack[--top];
		stack[top] = null;
		return poppedEmploye;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	
	public Emplyee peek() {
		if(isEmpty()) throw new EmptyStackException();

		Emplyee peekedEmployee = stack[size()-1];
		return peekedEmployee;
	}
	
	public int size() {
		return top;
	}
	
	
	public void printStack() {
		for (int i = top-1; i >= 0; i--) 
			System.out.println(stack[i]);
	}
	
}
