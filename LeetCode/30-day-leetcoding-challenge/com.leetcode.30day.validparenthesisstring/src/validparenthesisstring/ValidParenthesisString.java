package validparenthesisstring;

public class ValidParenthesisString {
	
	
	//Greedy
	/*
	 * Intuition

	When checking whether the string is valid, we only cared about the "balance": the number of extra, open left brackets as we parsed through the string. 
	For example, when checking whether '(()())' is valid, 
	we had a balance of 1, 2, 1, 2, 1, 0 as we parse through the string: '(' has 1 left bracket, '((' has 2, '(()' has 1, and so on. 
	This means that after parsing the first i symbols, (which may include asterisks,) we only need to keep track of what the balance could be.

	For example, if we have string '(***)', then as we parse each symbol, the set of possible values for the balance is: 
	[1] for '('; 
	[0, 1, 2] for '(*'; 
	[0, 1, 2, 3] for '(**'; 
	[0, 1, 2, 3, 4] for '(***',
	[0, 1, 2, 3] for '(***)'.

	Furthermore, we can prove these states always form a contiguous interval. 
	Thus, we only need to know the left and right bounds of this interval. 
	That is, we would keep those intermediate states described above as:
	
	[lo, hi] = [1, 1], [0, 2], [0, 3], [0, 4], [0, 3].

	Algorithm

	Let lo, hi respectively be the smallest and largest possible number of open left brackets after processing the current character in the string.

	If we encounter a left bracket (c == '(') >> lo++

	otherwise we could write a right bracket >> lo--

	If we encounter what can be a left bracket (c != ')') >> hi++
	
	otherwise we must write a right bracket >> 	hi--
	 
	
	If hi < 0, then the current prefix can't be made valid no matter what our choices are. 
	Also, we can never have less than 0 open left brackets. At the end, we should check that we can have exactly 0 open left brackets.	
	 * 
	 * 
	 */
	
	
	public boolean checkValidString(String s) {
        
		int low = 0, high = 0;
		
		for (char c  : s.toCharArray()) {
			low += c == '(' ? 1 : -1;
			high += c != ')' ? 1 : -1;
			if(high < 0) return false;
			low = Math.max(low, 0);
		}
			return low == 0;
	
    }
	
	
	/*
	 * 1- There are more open parenthesis but we have enough '*' so we can balance the parenthesis with ')'
	   2- There are more close parenthesis but we have enough '*' so we can balance the parenthesis with '('
	   3- There are as many '(' than ')' so all parenthesis are balanced, we can ignore the extra '*'

	   Algorithm: You can parse the String twice, once from left to right by replacing all '*' by '(' 
	   and once from right to left by replacing all '*' by ')'. 
	   For each of the 2 loops, if there's an iteration where you end up with a negative count 
	   		(SUM['('] - SUM[')'] < 0) then you know the parenthesis were not balanced.
	   You can return false. After these 2 checks (2 loops), 
	   you know the string is balanced because you've satisfied all the 3 valid cases mentioned above. Voila!
	 */
	 
	 public boolean checkValidStringEasyToUnderstand(String s) {
		if (s.length() == 0) return true;
		
		int left =0, right = 0;
		int n = s.length();
		
		for (int i = 0; i < n; i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '*') 
				left++;
			else
				left--;
			
		if(left < 0) return false; // We know we have unbalanced parenthesis
			
		}
		
		// We can already check if parenthesis are valid
		if (left == 0) return true; 
		 
		for (int i = n-1; i >= 0; i--) {
			if(s.charAt(i) == ')' || s.charAt(i) == '*')
				right++;
			else
				right--;
			
		if(right < 0) return false;	//We know we have unbalanced parenthesis
		}
		
		
		 // Here we know we have never been unbalanced parsing from left to right e.g. ')('
	    // We've also already substituted '*' either by '(' or by ')'
	    // So we only have 3 possible scenarios here:
	    // 1. We had the same amount of '(' and ')'
	    // 2. We had more '(' then ')' but enough '*' to substitute
	    // 3. We had more ')' then '(' but enough '*' to substitute
		 return true;
		 
	    }
	
	
}


