package arraystack;

import bean.Emplyee;

public class Main {

	public static void main(String[] args) {
		Emplyee jane = new Emplyee("Jane", "Jones", 123);
		Emplyee john = new Emplyee("John", "Doe", 4567);
		Emplyee mary = new Emplyee("Mary", "Smith", 22);
		Emplyee mike = new Emplyee("Mike", "Wilson", 3245);
		
		ArrayStack stack = new ArrayStack(3);
		
		stack.push(jane);
		System.out.println(stack.size());
		stack.push(john);
		System.out.println(stack.size());
		stack.push(mary);
		System.out.println(stack.size());
		stack.push(mike);
		System.out.println(stack.size());

		//System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		stack.printStack();

	}

}
