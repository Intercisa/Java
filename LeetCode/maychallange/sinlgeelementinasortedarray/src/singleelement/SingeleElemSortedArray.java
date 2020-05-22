package singleelement;

public class SingeleElemSortedArray {

	   public int singleNonDuplicate(int[] nums) {
	        
	    	int low = 0, N = nums.length, high = N/2;
			
			while (low < high) {
				int middle = low + (high - low)/2;
				
				if(nums[2 * middle] != nums[2* middle+1])
					high = middle;
				else
					low = middle+1;
			}
		
			return nums[2*low];
	    }
}




