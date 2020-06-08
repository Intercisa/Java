package poweroftwo;


public class PowerOfTwo {
	
	 public boolean isPowerOfTwo(int n) {
	       if(n<=0) return false;
	       return ( n & ( -n )) == n;
	    }

	 
	public boolean isPowerOfTwoII(int n) {
		if (n == 0)return false;
        
        while (n != 1) {
			if (n % 2 != 0) return false;
			n /= 2;
		}
		return true;
	}
	
	
	 public boolean isPowerOfTwoRecur(int n) {
	        if(n == 0) return false;
	        if(n == 1) return true;
	        return n % 2 == 0 && isPowerOfTwo(n/2);
	        
	    }
}