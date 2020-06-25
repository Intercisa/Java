package findtheduplicatenumber;

public class FindDuplicateNum {

	
	public int findDuplicate(int[] nums) {
	    int slow = nums[0], fast = nums[nums[0]];

			do {
				slow = nums[slow];
				fast = nums[nums[fast]];
			} while (slow != fast);
			
	        slow = 0;

			while (fast != slow) {
				slow = nums[slow];
				fast = nums[fast];
			}
			
			return slow;
	}
}