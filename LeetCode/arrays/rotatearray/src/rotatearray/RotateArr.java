package rotatearray;

public class RotateArr {
	
	
	//in place
	public int[] rotate(int[] nums, int k) {
		k %= nums.length; // makes sure that k is less than the length of the array.
		reverse(nums, 0, nums.length -1 );
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		
		return nums;
	}
	
	
	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			start++;
			end--;
		}
	}

	public int[] rotateEasy(int[] nums, int k) {
		
		int[] result = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++)
			result[(i+k) % nums.length ] = nums[i];
			
		return result;
	}
	
	//rotates right if n is positive and left if n is negative
	   public int[] rotateRightAndLeft(int[] nums, int k) {
		   
		   if(k < 0) {
			   k = -k % nums.length; //convert to positive number specifying how many positions left to rotate & mod
			   
			   k = nums.length - k; //rotate left by k = rotate right by length -k
		   }
		   
		   int[] result = new int[nums.length];
		   for (int i = 0; i < result.length; i++) 
			   result[(i+k) % nums.length] = nums[i]; 
		
		   return result;
	    }
}



