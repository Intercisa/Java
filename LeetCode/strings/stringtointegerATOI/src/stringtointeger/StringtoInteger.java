package stringtointeger;

public class StringtoInteger {
	public int myAtoi(String str) {

		if (str == null || str.length() == 0) return 0;

		str = str.trim();// get rid of whitespaces

		if (str.equals("")) return 0; //if the string is all whitespace after the trim it will be "" and that will throw a null pointer at str.charAt(0);
		long sum = 0;
		char firstChar = str.charAt(0);
		int sign = 1, start = 0, len = str.length();

		if (firstChar == '+') {
			sign = 1;
			start++;
		} else if (firstChar == '-') {
			sign = -1;
			start++;
		}

		for (int i = start; i < len; i++) {
			if (!Character.isDigit(str.charAt(i)))
				return (int) sum * sign;
			sum = sum * 10 + str.charAt(i) - '0';// getting the actual number -> charAt = '4' >> int value 52 and '0' is 48 -> 52 - 48 = 4
												
			if (sign == 1 && sum > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
		}

		return (int) sum * sign;
	}
}
