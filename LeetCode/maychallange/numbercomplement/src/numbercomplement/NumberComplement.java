package numbercomplement;

public class NumberComplement {
	
	
	 public int findComplement(int num) {
		    int complement = num;
	        int sum = 0;
	        
	        while(num > 0){
	            sum = (sum << 1) + 1;
	            num >>= 1;
	        }
	        return sum - complement; 
	 }
	 
	 
	   public int findComplementFlipBit(int num) {
	        //complement = num ^ allone
	        //010 = 101 ^ 111
	        //calculate all one set
	        int rec = num, bit = 1;
	        while(rec != 0) {
	            //flip curr bit
	            num ^= bit; //num = num ^ bit;
	            bit <<= 1; //bit = bit << 1;
	            rec >>= 1; //record the length; rec = rec >> 1;
	        }
	        return num;
	    }
	 
	
	 
	public int findComplementVerySlow(int num) {
			String bin = "";
			
			while (num != 0) {
				bin=(num%2==1?0:1)+bin;
				num/=2;
			}
			return Integer.parseInt(bin, 2);
	    }
}




