package bits;

public class FlipBit {
	
	
	//x =        01100110
	//position = 00000010
	//mask =     00000100
	//^mask =    01100010
	
	
	public int flipBit(int x, int position) {
		int mask = 1 << position;
		return x ^mask; //0110010
	}
}



