package intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionTwoArrays {
	
	/*
	 * 
     * Make a Map with numbers from nums1
     *  "key" is number
     *  "value" is how many times it appears in nums1
     * Loop through nums2 to see which numbers match with Map representing nums1
     * Since our return value must be an array, convert our solution set into an array.
	 */
	
	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null) return new int[0];
		int[] result;
		List<Integer> tempList = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int n : nums1) 
			map.put(n, map.getOrDefault(n, 0)+1);
		
		for (int n2 : nums2) {
			if(map.containsKey(n2) && map.get(n2) > 0) {
				tempList.add(n2);
				map.put(n2, map.getOrDefault(n2, 0) - 1);
			}
		}
		
		result = new int[tempList.size()];
		for (int i = 0; i < result.length; i++) 
			result[i] = tempList.get(i);
		
		return result;
	}

	
	public int[] intersectSorting(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null) return new int[0];
		int[] result;
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int ptr1 = 0, ptr2  = 0;
		
		while((ptr1 < nums1.length) &&(ptr2< nums2.length)){
			if(nums1[ptr1]<nums2[ptr2]){
				ptr1++;
			}else{
				if(nums1[ptr1]>nums2[ptr2]){
					ptr2++;
				}else{
					tempList.add(nums1[ptr1]);
					ptr1++;
					ptr2++;
				}
			}
		}
		
		result = new int[tempList.size()];
		for (int i = 0; i < result.length; i++) 
			result[i] = tempList.get(i); 
		
		return result;
	}
	
}



