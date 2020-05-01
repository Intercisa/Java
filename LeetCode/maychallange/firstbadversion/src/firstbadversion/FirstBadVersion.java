package firstbadversion;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class FirstBadVersion {
	
	 public int firstBadVersion(int n) {
		
		 int start = 1, end = n;
		 
		 while(start < end) {
			 
			int mid = start + (end-start)/2; //use this format to avoid the overflow
			 
			if(isBadVersion(mid))
				end = mid;
			else
				start = mid +1; 
		 }
		 return end;
	 }
	 
	private boolean isBadVersion(int version) {
		 return version >= 2;
	 }
	
}


