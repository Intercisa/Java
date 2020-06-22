package singlenumberII;

import java.util.HashMap;

public class SingleNumII {
	//bit manipulation solution
	//https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/542/week-4-june-22nd-june-28th/3368/discuss/43295/Detailed-explanation-and-generalization-of-the-bitwise-operation-method-for-single-numbers
	//https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/542/week-4-june-22nd-june-28th/3368/discuss/43332/My-own-explanation-of-bit-manipulation-method-might-be-easier-to-understand
    
	public int singleNumber(int[] nums) {
  	  int countOne = 0, countTwo = 0;
  	  
  	  for (int num : nums) {
		countOne = (~countTwo) & (countOne ^ num);
		countTwo = (~countOne) & (countTwo ^ num);
	}
  	  
  	  return countOne;
    	
    }
	
   
    public int singleNumberSimple(int[] nums) {
    	  
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for (int num : nums) 
    		map.put(num, map.getOrDefault(num, 0)+1);
    	
    	for (int num : nums) 
    		if(map.get(num) == 1) return num;

    	return -1;
    }
	
	
	public int singleNumberStream(int[] nums) {
  
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for (int num : nums) 
    		map.put(num, map.getOrDefault(num, 0)+1);
    	
    	return map.entrySet()
    			.stream()
    			.filter(n -> n.getValue() == 1)
    			.findFirst()
    			.get()
    			.getKey();

    }
}
