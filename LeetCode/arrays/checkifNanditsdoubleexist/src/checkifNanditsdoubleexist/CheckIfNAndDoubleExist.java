package checkifNanditsdoubleexist;

import java.util.HashSet;

public class CheckIfNAndDoubleExist {
	
	  public boolean checkIfExist(int[] arr) {
		  HashSet<Integer> lookupSet = new HashSet<>();
			for(int a : arr) {
				//we need to ensure that the current number is even >> 3 & 7 -> 7/2 would give 3 (not 3.5) which is present in the HashSet but not what we need
				if(lookupSet.contains(a*2) || (a%2 == 0 && lookupSet.contains(a/2))) return true; 
				lookupSet.add(a);
			}
			return false;
	  }
}



