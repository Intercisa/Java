package movezeros;

public class MoveZeros {
	public int[] moveZeroes(int[] nums) {
		
		if (nums ==  null) return null;
		int ptr = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				int tmp = nums[ptr];
				nums[ptr++] = nums[i];
				nums[i] = tmp;
			}
		}
		return nums;
	}
}



