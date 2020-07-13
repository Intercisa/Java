package bits;

public class IsBitSet {
	
	
	//x =        01100110
	//position = 00000101
	//shifted =  00000011

	
	
	public int isBitSet(int x, int position) {
		int shifted = x >> position;
		return shifted & 1; //0000001
	}
}



