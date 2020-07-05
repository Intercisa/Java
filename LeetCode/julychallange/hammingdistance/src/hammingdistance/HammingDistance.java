package hammingdistance;

public class HammingDistance {

	public int hammingDistance(int x, int y) {
		int dist = 0;
		
		for (int i = x ^ y; i > 0; i >>= 1) 
			if((i & 1) == 1) dist++;
		
		return dist;
	}
	
	
	public int hammingDistanceChar(int x, int y) {
		int dist = 0;
		String strX = asBitString(x);
		String strY = asBitString(y);
		
		for (int i = 0; i < strX.length(); i++) 
			if(strX.charAt(i) != strY.charAt(i)) dist++;
			
		return dist;
	}
	
	public static String asBitString(int value) {
		  final char[] buf = new char[32];
		  for (int i = 31; i >= 0; i--) 
		    buf[31 - i] = ((1 << i) & value) == 0 ? '0' : '1';
		  
		  return new String(buf);
		}
}
