package productofarrayexceptself;


public class ProductOfArrayExceptSelf {
	 
	public int[] productExceptSelf(int[] nums) {

		if (nums.length == 0) return nums;	
	
		int n = nums.length;
		int[] output = new int[n];
		
		//left
		output[0] = 1;
		for (int i = 1; i < n; i++) {
			output[i] = output[i - 1] * nums[i - 1];
		}
		//output: 1,1,2,6
	
		//right
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			//for debug: 
			System.out.println("output[i]: " + output[i] +   " right: " + right);
			/*
			output[i]: 6 right: 1 == 6
			output[i]: 2 right: 4 == 8
			output[i]: 1 right: 12 == 12
			output[i]: 1 right: 24 == 24
			*/
			output[i] *= right;
            right *= nums[i];
		}
	
		
	return output;
	    }

	}


	
/*	
 * Brute force solution: 
 * 
public int[] productExceptSelf(int[] nums) {
    
    if (nums.length == 0) return nums;
	
	int n = nums.length;
	int[] output = new int[n];
	int index= 0;
	
	for (int i = 0; i < n; i++) {
		output[index] = sumNumsWithoutSelf(nums, i);
		index++;
	}
	
	return output;
    }

private int sumNumsWithoutSelf(int[] nums, int exceptNum) {
	
	int sum = 1;
	for (int i = 0; i < nums.length; i++) {
		
		if(i != exceptNum)
			sum*=nums[i];
	}

	return sum;
}
	
}

*/
