package sortcolors;

public class SortColors {
	
	
	int[] sortColors(int nums[]) {
		int ptrFront = 0, i = 0, ptrEnd = nums.length-1;
		
		while (i <= ptrEnd) {
			if(nums[i] == 0) swap(nums, ptrFront++, i++);
			else if(nums[i] == 1) i++;
			else swap(nums, ptrEnd--, i); //if nums[j] == 2
		}
		
		return nums;
	}


	public int[] sortColorsII(int[] nums) {
		int ptrRed = 0;
		int ptrBlue = nums.length - 1;
		int i = 0;

		while (i <= ptrBlue) {
			if (nums[i] == 0) {
				swap(nums, i, ptrRed);
				ptrRed++;
				i++;
			} else if (nums[i] == 2) {
				swap(nums, i, ptrBlue);
				ptrBlue--;
			} else {
				i++;
			}
		}
		return nums;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
}
