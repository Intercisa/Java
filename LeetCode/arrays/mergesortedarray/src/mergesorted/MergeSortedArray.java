package mergesorted;

import java.util.Arrays;

public class MergeSortedArray {

	//different approach 
	public void mergeForFun(int[] nums1, int m, int[] nums2, int n) {
		int index = 0;
		for (int i = m; i < m+n; i++, index++) 
			nums1[i] = nums2[index];
		
		Arrays.sort(nums1);
	}
	
	
	
	//fit better for the task
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] mergeArr = new int[nums1.length];
		
		int num1Index = 0;
		int num2Index = 0;
		
		for (int i = 0; i < m+n; i++) {
			
			if (num1Index >= m) {
				mergeArr[i] = nums2[num2Index];
				num2Index++;
				continue;
			}
			if(num2Index >= n){
				mergeArr[i] = nums1[num1Index];
				num1Index++;
				continue;
			}
			if(nums1[num1Index] < nums2[num2Index]) {
				mergeArr[i] = nums1[num1Index];
				num1Index++;
			}else {
				mergeArr[i] = nums2[num2Index];
				num2Index++;
			}			
		}
		
		for(int i = 0; i < m+n; i++)
            nums1[i] = mergeArr[i];
	    }
	 
	 
}


