package bits;

public class ModifyBit {
	
	
	//x =        	00000110
	//position = 	00000101
	//state =    	00000001
	//shifted =  	00100000
	
	//~mask =    	11011111   	00000110 x & ~mask
	//-state=	 	11111111 | 	00100000 -state & mask
	
	//x & ~mask  	00000110
	//-state & mask 00100000  ->00100110
	
	
	public int modifyBit(int x, int position, int state) {
		int mask = 1 << position;
		return (x & ~mask) | (-state & mask);
	}
}



