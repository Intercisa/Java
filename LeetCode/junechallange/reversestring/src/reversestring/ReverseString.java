package reversestring;

public class ReverseString {

	 public char[] reverseString(char[] s) {
		 
		reverseHelper(s);
		return s;
	 }

	private void reverseHelper(char[] s) {
		
		int start = 0, end = s.length-1;
		
		while (start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
	}
}




