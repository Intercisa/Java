package plusone;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        
	    for(int i=digits.length-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        digits[i] = 0; //if it's bigger than 9 we make it a zero and check if the next number is smaller or bigger than 9 
	        //if smaller we add 1 and return else we switch it to zero and check the next one 
	    }
	    
	    int[] newNumber = new int [digits.length+1]; //edge case-> all numbers are 9-s so we return an array length+1 with a 1 on the start with 0-s of length digits
	    newNumber[0] = 1;
	    
	    return newNumber;
	}
}



