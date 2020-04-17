package backspacestringcompare;

import java.util.Stack;

public class CompareString {
	 public boolean backspaceCompare(String S, String T) {
		 if(S.length() != T.length());
		 return bulidStack(S).equals(bulidStack(T));
	    }

	private String bulidStack(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for (Character ch : str.toCharArray()) {
			if(ch != '#') {
				stack.push(ch);
			}else if (!stack.empty()) {
				stack.pop();
			}
			//for debug 
			System.out.println(String.valueOf(stack));
			
		}
		return String.valueOf(stack);
	}

}
