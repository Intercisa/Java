package firstbadversion;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class FirstBadVersionRecursion {
	
	 public int firstBadVersion(int n) {
		 return recurHelper(1, n);	 
	 }
	  
	private int recurHelper(int start, int end) {
		int mid = start+(end-start)/2;
		
		if(end <= start) return end;
		
		if(isBadVersion(mid))
			return recurHelper(start, mid);
		else
			return recurHelper(mid+1, end);
	}


	private boolean isBadVersion(int version) {
		 return version >= 2;
	 }
	
}

