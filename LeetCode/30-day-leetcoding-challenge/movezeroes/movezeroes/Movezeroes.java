package movezeroes;

public class Movezeroes {
public void moveZeroes(int[] nums) {
    
	//two pointer approach
	
	int n = nums.length;
	int ptr1 = 0;
	int ptr2 = 1;
	
	while(ptr2<n) {
		if(nums[ptr1] == 0) {
			if(nums[ptr2] != 0) {
				nums[ptr1] = nums[ptr2];
				nums[ptr2] = 0;
				ptr1++;
				ptr2++;
				
			}else {
				ptr2++;
			}	
		}else {
			ptr2++;
			ptr1++;
		}	
	}
    }

}


