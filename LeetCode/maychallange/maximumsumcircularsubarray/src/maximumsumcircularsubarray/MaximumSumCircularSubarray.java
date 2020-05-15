package maximumsumcircularsubarray;

public class MaximumSumCircularSubarray {
	
	public int maxSubarraySumCircular(int[] A) {
		if(A.length == 0) return 0;
		
		//get the maximum sum using standard kadane
        int kadMax = getKadanes(A), tmpMax = 0, reverseKadMax;
       
        //find the maximum sum that includes corner elements
        for(int i=0; i<A.length;i++){
            tmpMax += A[i];
            A[i] = -A[i]; //invert the array (change sign) 
        }
        
        reverseKadMax = getKadanes(A);
        return (tmpMax+reverseKadMax == 0) ? kadMax : Math.max(kadMax, tmpMax+reverseKadMax);
	}
	
	private int getKadanes(int[]nums){
		
		int maxRes = nums[0], currMax = nums[0];
		
		for (int i = 1; i < nums.length; i++) { //start from 1 otherwise won't work (because we initialize with nums[0])
			currMax = Math.max(nums[i], currMax+nums[i]);
			
			if(currMax > maxRes)
				maxRes = currMax;
		}
		return maxRes;
	}
	
/*
	Find maximum subarray sum using kadane's algorithm (max) 
	2. Find minimum subarray sum using kadane's algorithm (min)
	3. Find total sum of the array (sum)
	4. Now, if sum == min return max
	5. Otherwise, return maximum ( max, sum - min )
*/
    public int maxSubarraySumCircular2(int[] A) {
        if(A.length == 0) return 0;
        int sum = A[0];
        int maxSoFar = A[0];
        int maxTotal = A[0];
        int minTotal = A[0];
        int minSoFar = A[0];
        for(int i = 1; i < A.length; i++){
            int num = A[i];
            maxSoFar = Math.max(num, maxSoFar + num);
            maxTotal = Math.max(maxSoFar, maxTotal);
            
            minSoFar = Math.min(num, minSoFar + num);
            minTotal = Math.min(minTotal, minSoFar);
            
            sum += num;
        }
        if(sum == minSoFar) return maxTotal;
        return Math.max(sum - minTotal, maxTotal);
    }
}



