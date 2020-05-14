package validpalindrome;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			if (!Character.isLetterOrDigit(s.charAt(i)))
				continue;
			else
				sb.append(s.charAt(i));

		}

		for (int i = 0; i < sb.length(); i++)
			if (sb.charAt(i) != sb.charAt(sb.length() - i - 1))
				return false;

		return true;

	}
}
