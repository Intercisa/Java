package countingbits;

public class CountingBits {

	 private int[] recursiveResult; //array for the recursive solution

	 //iterative DP solution
	 public int[] countBits(int num) {
	
		 if(num < 0) return new int[1];
		 
		// allocate array including 0->num
		int[] countBitArr = new int[num + 1];
		
		//init DP data -> not necessary, only for clearer understanding  
		countBitArr[0] = 0;
		
		for (int i = 1; i <= num; i++) 
			 // if num is even, bit count is same as num / 2
            // if odd, bit count is same as (num / 2) + 1
			countBitArr[i] = countBitArr[i >> 1] + i % 2;
		
		 return countBitArr;
	 }
	 
	 //recursive solution
	 public int[] countBitsRecursive(int num) {
	     recursiveResult = new int[num+1];
		 countRecursive(num);
		 return recursiveResult;
	    }

	private void countRecursive(int num) {
		if (num  ==  0) return;
		
		int curr = num;
		int count = 0;
		while (curr!=0) {
			curr = curr & (curr-1);
			count++;
		}
		recursiveResult[num] = count;
		countRecursive(num-1);
	}
	
}




