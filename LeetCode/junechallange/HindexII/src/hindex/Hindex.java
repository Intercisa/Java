package hindex;

public class Hindex {

	public int hIndex(int[] citations) {
		int n = citations.length;
		int left = 0, right = n - 1, mid;
		
		while (left <= right) {
			mid = left + ((right-left)/ 2);
			
			if(citations[mid] == n - mid) return n - mid;
			
			else if(citations[mid] < n -mid) left = mid + 1;
			else right = mid - 1;
		}
		return n-left;
	}

}
/*
https://leetcode.com/problems/h-index-ii/solution/
Approach 2: Binary Search, O(log N) time

Algorithm

First we pick a pivot element that is in the middle of the list, i.e. citations[pivot], 
which would divide the original list into two sublists: citations[0 : pivot - 1] and citations[pivot + 1 : n].

Then comparing between the values of n - pivot and citations[pivot] element, 
our binary search algorithm breaks down to the following 3 cases:

citations[pivot] == n - pivot: We found the desired element !

citations[pivot] < n - pivot: Since the desired element should be greater or equal to n - pivot, 
we then further look into the sublist on the right hand side, i.e. citations[pivot + 1 : n].

citations[pivot] > n - pivot: We should look into the sublist on the left hand side, i.e. citations[0 : pivot-1].

A minor difference to the typical binary search algorithm, is that in this case we return the value of n - pivot as the result, 
rather than the value of the desired element.
*/