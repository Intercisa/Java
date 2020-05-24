package shortest;

import java.util.Arrays;

public class ShortestWord {
	
	//with stream
	public static int findShort(String s) {

		return Arrays.stream(s.split(" "))
				.mapToInt(String::length)
				.min().getAsInt();
	}
	
	
	
	
	public static int findShortForEach(String s) {
		if(s == null || s.length() == 0) return 0;
		
		String[] ansArr = s.split(" ");
		int ansMin = ansArr[0].length();

		for (String str : ansArr) 
			ansMin = Math.min(ansMin, str.length());
		

		return ansMin;

	}
}
