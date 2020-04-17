package contiguousarray;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
	 

	
	 public int findMaxLength(int[] nums) {
		 if(nums == null || nums.length == 0) return 0;
		
		 int n = nums.length;
		 //Map to keep track of sum formed so far till which index
		 Map<Integer, Integer> map = new HashMap<>();
		 map.put(0,-1);
		 int maxL = 0;
		 int preSum = 0;
		 
		 for (int i = 0; i < n; i++) {
			
			 // lets model 0 as -1 and 1 as 1
	         // this way we need to find longest array with sum 0
			 preSum += (nums[i] == 0) ? -1 : 1;
			 
			/* if same sum encountered again that means elements from that index onwards till current index sum up to zero 
			 *  -> i.e. equal number of 0 & 1
	        */ 
			 if(map.containsKey(preSum)) 
				 maxL = Math.max(maxL, i - map.get(preSum)); //if there is previous record, cut off from index the sub-array so that give you the even 2nd part;
			 else
				 map.put(preSum, i);						//put in the map the preSum with the index 
			 
			 
			 }
		 return maxL;
		}

	


/*faster solution without HashMap:
 * 
 *
 */


        public int findMaxLengthFasster(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        int[] recorder = new int[2 * nums.length + 1];
        
        for( int i = 0; i < recorder.length; i++) recorder[i] = -2;
  
        int sum = n;
        int max = 0;
        recorder[n] = -1;
        
        for ( int i = 0; i < n; i++){
            sum += (nums[i] * 2 - 1);
           
            
            if (recorder[sum] == -2)
                recorder[sum] = i; 
            else
                max = Math.max(max, i - recorder[sum]);
        }
        
        for (int i : recorder) {
			System.out.println(i);
		}
        
        
        return max;
    }

}

