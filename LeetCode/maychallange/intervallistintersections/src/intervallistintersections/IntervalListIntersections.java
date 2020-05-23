package intervallistintersections;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
	  public int[][] intervalIntersection(int[][] A, int[][] B) {
	      List<int[]> ans = new ArrayList<int[]>();
	      
	      int i = 0, j = 0;
	      
	      while (i < A.length && j < B.length) {
	    	  //check if A[i] intersects B[j]
	    	  // lo -> startpoint of the intersection
	    	  // hi -> endpoint of the intersection
	    	  int lo = Math.max(A[i][0], B[j][0]);
	    	  int hi = Math.min(A[i][1], B[j][1]);
	    	  
	    	  if(lo <= hi)
	    		  ans.add(new int[] {lo, hi});
	    	  
	    	  if(A[i][1] < B[j][1])
	    		  i++;
	    	  else
	    		  j++;
		}
		  
	      return ans.toArray(new int[ans.size()][]);
		  
	    }
}