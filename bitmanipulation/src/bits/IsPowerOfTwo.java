package bits;

public class IsPowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		return (n & n-1) == 0;
	}
	
	// 1000
	// &
	// 0111
	// 0000
	
}
