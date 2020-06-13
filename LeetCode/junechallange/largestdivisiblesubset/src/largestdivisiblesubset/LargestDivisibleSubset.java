package largestdivisiblesubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
	public List<Integer> largestDivisibleSubset(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		if (nums == null || nums.length == 0) return result;
		
		//Sort all array elements in increasing order. 
		//The purpose of sorting is to make sure that all divisors of an element appear before it.
		Arrays.sort(nums);

		 //array that maintains the maximum index  
        //till which the condition is satisfied 
		int[] divCount = new int[nums.length];
		
		
		//maintain the index of the last increment 
		int[] prev = new int[nums.length];
		
		
		 //we will always have atleast one  
        //element divisible by itself 
		Arrays.fill(divCount, 1);
		
		Arrays.fill(prev, -1);

		//index at which last increment happened 
		int maxIndex = 0;

		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				
				//only increment the maximum index if  
                //this iteration will increase it 
				if (nums[i] % nums[j] == 0 && divCount[i] < divCount[j] + 1) {
					prev[i] = j;
					divCount[i] = divCount[j] + 1;
				}
			}

			 //Update last index of largest subset if size 
	        //of current subset is more. 
			if (divCount[i] > divCount[maxIndex]) maxIndex = i;
		}

		int k = maxIndex;
		while (k >= 0) {
			result.add(nums[k]);
			k = prev[k];
		}
		return result;

	}
}
