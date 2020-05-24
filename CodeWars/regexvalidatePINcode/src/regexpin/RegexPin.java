package regexpin;

public class RegexPin {
	public static boolean validatePin(String pin) {

		/*
		 * in details: 
		 * 
		String regex = "^\\d{4}$|^\\d{6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pin);
		
		return matcher.matches();
		*/
		
		//same as: 
		return pin.matches("^\\d{4}$|^\\d{6}$");
		

	  }
}



