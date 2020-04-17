package performstringshifts;


public class PerformStringShifts {
	 
	private char[] temp;
	
	public String stringShift(String s, int[][] shift) {
		if(s == null || s.length() <= 1) return s; 	
		
		int n = shift.length;
		char[] chArr = s.toCharArray();
		int shifts = 0;
		 
		 for (int i = 0; i < n; i++) {
			shifts += shift[i][0] == 1 ? shift[i][1] : - (shift[i][1]);	
		}
		 
		 if(shifts == 0 || shifts == n) {
			 return s;
		 }else if(shifts < 0) { 
			shifts = - shifts % n;	//convert to positive number specifying how many positions left to rotate & mod
			shifts = n - shifts;	// rotate left by shifts = rotate right by n(length) - shifts
		 }
		 
		 return performRotatiton(chArr, shifts);
		 
	    }

	
	private String performRotatiton(char[] s, int shifts) {
		int length = s.length;
		temp = new char[length];
		
		for (int i = 0; i < length; i++) {
			temp[(i+shifts) % length] = s[i];
		}
		
		return new String(temp);
		
	}
	
}


