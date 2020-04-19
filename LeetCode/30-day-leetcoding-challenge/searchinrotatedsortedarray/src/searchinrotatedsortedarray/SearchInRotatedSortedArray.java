package searchinrotatedsortedarray;

public class SearchInRotatedSortedArray {
	
	
	/*
	 * The array now can be split in two sorted array -> head 4,5,6,7, and tail 0,1,2
	 * We have to find which part (head or tail) of the array is the target 
	 * Because these are placed in the order -> the point where the tail ends and the head begins, 
	 * indicates the only point where the previous element is greater than the current element.
	 */
	
	
	 public int search(int[] nums, int target) {
		 if(nums == null || nums.length == 0) return -1;
		 
		 if(target < nums[0]) //search in tail  
			 return searchTail(nums, target);
		 else				  //search in head
			 return searchHead(nums, target);

	    }


	private int searchHead(int[] nums, int target) {
		int prev;
		int n = nums.length;
		int curr = nums[0];
		
		if(curr==target) return 0;
		
		for (int i = 1; i < n; i++) {// 1 because we already checked 0 
			prev = curr;
			curr = nums[i];
			
			if(prev>curr) //there is no way the target is in the array 
				break; //same as we just do return -1, but this way it's more readable;
			
			else if(curr==target)
				return i;
		}
		
		return -1;
	}
	
	private int searchTail(int[] nums, int target) {
		int prev;
		int n = nums.length;
		int curr = nums[n-1];
		
		if(curr == target) return n-1;
		
		for (int i = n-2; i > 0; i--) { //-2 because we already checked n-1 
			prev = curr;
			curr = nums[i];
			
			if(prev < curr) //there is no way the target is in the array 
				break; //same as we just do return -1, but this way it's more readable;
			
			else if(curr == target) 
				return i;
			
		}
		
		return -1;
	}
	
}


