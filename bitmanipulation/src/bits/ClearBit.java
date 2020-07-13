package bits;

public class ClearBit {
	
	
	//x =        00000110
	//position = 00000010
	//mask =     00000100
	//~mask =    11111011
	
	
	public int clearBit(int x, int position) {
		int mask = 1 << position;
		return x & ~mask; //0000010
	}
}



