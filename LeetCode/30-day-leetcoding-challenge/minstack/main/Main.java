package main;

import minstack.MinStack;

public class Main {
	/*
	 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
       push(x) -- Push element x onto stack.
       pop() -- Removes the element on top of the stack.
       top() -- Get the top element.
       getMin() -- Retrieve the minimum element in the stack.
	 */
	

	public static void main(String[] args) {
		
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		
		System.out.println(minStack.getMin());
		
		minStack.pop();
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());

	}

}
