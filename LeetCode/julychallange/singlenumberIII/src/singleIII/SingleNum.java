package singleIII;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SingleNum {
	
	public int[] singleNumber(int[] nums) {
		
		// Pass 1 : 
        // Get the XOR of the two numbers we need to find
		int diff = 0;
		for (int num : nums) diff ^=num;
		 
		// Get its last set bit
		diff &= -diff;
		
		int res[] = {0,0};
		
		for (int num : nums) 
			if((num & diff) == 0) res[0] ^= num; // the bit is not set
			else res[1] ^=num; // the bit is set
		
		return res;
	}
	
	public int[] singleNumberStream(int[] nums) {
		
		return Arrays.stream(nums)
				.boxed()
				.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue()==1)
				.map(e -> e.getKey())
				.mapToInt(Integer::intValue)
				.toArray();
	}
}
