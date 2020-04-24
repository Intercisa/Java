package ones;

public class MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		
		int n = nums.length;
		int count = 0;
		int res = 0;
		
		for (int i = 0; i < n; i++) {
			if(nums[i] == 1) { 
				count++;
			}else {
				res = Math.max(res, count);
				count = 0;
			}
		}
        return res = Math.max(res, count);
    }
}


