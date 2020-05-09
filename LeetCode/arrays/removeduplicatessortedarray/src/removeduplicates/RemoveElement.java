package removeduplicates;

public class RemoveElement {
	
public int removeDuplicates(int[] nums) {
	if(nums.length == 0 || nums.length == 1) return nums.length;
	int ptr = 0;
	
	for (int i = 0; i < nums.length-1; i++) 
		if(nums[i] != nums[i+1]) 
			nums[ptr++] = nums[i];
	
	nums[ptr++] = nums[nums.length-1];
		
	return ptr;
	
	
    }
}



