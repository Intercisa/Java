package reversestr;

public class ReverseString {
	
	 public char[] reverseString(char[] s) {
		 	reverse(s, 0, s.length-1);
	        return s;
	 }

	private void reverse(char[] str, int start, int end) {
		while (start < end) {
			char tmp = str[start];
			str[start] = str[end];
			str[end] = tmp;
			start++;
			end--;
		}
	}
}



