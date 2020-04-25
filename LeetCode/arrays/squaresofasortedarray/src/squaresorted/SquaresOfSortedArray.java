package squaresorted;

import java.util.Arrays;

public class SquaresOfSortedArray {

	
	 public int[] sortedSquares(int[] A) {
		if(A==null || A.length == 0) return null;
		int n = A.length;
		
		for (int i = 0; i < n; i++) 
			A[i] *= A[i];
		
		
		Arrays.sort(A);
		
		return A;
	}	
}

