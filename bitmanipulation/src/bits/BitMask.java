package bits;

public class BitMask {
	
	//x =        00000110
	//position = 00000101
	//mask =     00100000
	
	public int bitMask(int x, int position) {
		int mask = 1 << position;
		return x | mask; // 00100110
	}
}



