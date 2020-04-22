package subarraysumequalsk;

import java.util.HashMap;

public class SubarraySumEqualsK {
	

	
	public int subarraySum(int[] nums, int k) {
    
		if(nums == null || nums.length == 0) return 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1); //important to increment if sum-k==0 -> arr: 1,2,3 k: 3 -> 1 + 2 - 3 == 0
		int n = nums.length;
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			sum+=nums[i];
			count += map.getOrDefault(sum - k , 0); //if there is a number == sum-k we increment coz' that's really a continuous subarray == k
			//1+2 == 3 -> +1 -> 6-k == 3 -> +1 -> 9-k == 6 -> +1 (we store the sums in the map and if a subarray occurs with the sum of == k we increment +1)
			map.put(sum, map.getOrDefault(sum, 0)+1);


		}
		return count;
		
	}
		   



}


