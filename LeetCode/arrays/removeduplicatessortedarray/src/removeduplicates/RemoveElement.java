package removeduplicates;

public class RemoveElement {
//two pointer 
	
	
//cleaner
	public int removeDuplicates(int[] nums) {
	
		if(nums == null) return 0;
		int writePtr = 1;
		
		for (int readPtr = 1; readPtr < nums.length; readPtr++) {
			if (nums[readPtr] != nums[readPtr - 1]) 
				nums[writePtr++] = nums[readPtr];
				//writePtr++;
			
		}
		return writePtr;
		
	}
	
	public int removeDuplicates2(int[] nums) {
		if(nums.length == 0 || nums.length == 1) return nums.length;
			int ptr = 0;
	
		for (int i = 0; i < nums.length-1; i++) 
			if(nums[i] != nums[i+1]) 
				nums[ptr++] = nums[i];
	
		nums[ptr++] = nums[nums.length-1];
		
		return ptr;
    }
}



