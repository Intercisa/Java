package even;

public class EvenNumberDigits {

	 public int findNumbers(int[] nums) {
		 if(nums == null || nums.length == 0) return 0;
		 int n = nums.length;
		 int count = 0;
		 
		 for (int i = 0; i < n; i++) {
			 if(isEven(nums[i]))
				 count++;
		}
	     return count;
	 }

	private boolean isEven(int n) {
		int count = 0;
		while (n > 0) {
			n/=10;
			count++;
		}
		return count%2==0?true:false;
	}
}


