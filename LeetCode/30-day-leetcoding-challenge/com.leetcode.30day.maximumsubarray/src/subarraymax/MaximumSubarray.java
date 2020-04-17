package subarraymax;

//faster approach
public class MaximumSubarray {
	  public int maxSubArray(int[] nums) {
	      int n = nums.length;
	      int maxRes = Integer.MIN_VALUE;
	      int maxNow = 0;
	      
		  for (int i = 0; i < n; i++) {
			  maxNow+=nums[i];
			  
			  //for debug 
			  System.out.println("maxEnding:" + maxNow);
			  
			  if(maxRes < maxNow)
				  maxRes = maxNow;
			  if(maxNow < 0)
				  maxNow = 0;
		  }
		  
		  return maxRes;
		  
	    }
	  
	  
	  public int maxSubArrayDifferent(int[] nums) {
		  
	       int maxSum = nums[0];
	    	for (int i = 1; i < nums.length; i++) {
	    		if (nums[i-1] > 0) {
	    			nums[i] += nums[i-1];
	    		}
	    		maxSum = Math.max(maxSum, nums[i]);
	    	}
	    	return maxSum;
		  
	  }
	  
	  
	  /*
	   * Kotlin solution 
	   * 
	    fun maxSubArray(nums: IntArray): Int {
        var ans = nums[0]
        var tmpSum = nums[0]
        
        for (i in 1 until nums.size) {
            tmpSum = Math.max(tmpSum + nums[i], nums[i])
            ans = Math.max(ans, tmpSum)
        }
        
        return ans
    }
	   * 
	   * 
	   */
	  
	  
	  
}
