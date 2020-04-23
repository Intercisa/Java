package bitwiseANDofnumbersrange;

/*
 * Flip the Least Significant Bit (LSB)  of n.
	And check if the new number is in range(m < number < n) or not
    if the number greater than 'm' again flip lsb
    if it is not then that's the answer
	NOTE: We are not considering inclusive range so if the number is 'm' we shouldn't flip anymore i.e.'m' will be the answer.
 * 
 */

public class BitwiseAndOfNumbersRange {
public int rangeBitwiseAnd(int m, int n) {
	// -n is the 2's complement of n when do bitwise or with n  
    //we get LSB and we subtract that from n  
		
		while (m < n) 
			n -= (n & -n);	
		
        return n;
    }
	
	
}


