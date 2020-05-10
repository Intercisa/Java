package validmountainarray;

public class ValidMountainArray {
	 public boolean validMountainArray(int[] A) {
		 if (A.length <= 2 ||
			  A[0] >= A[1] ||
			  A[A.length-2]<=A[A.length-1]) return false; 
		 
	        int N = A.length, left = 0, right = N - 1;
	        while (left + 1 < N && A[left] < A[left + 1]) left++;
	        while (right > 0 && A[right - 1] > A[right]) right--;
	       
	        return left == right;
	    }
}



