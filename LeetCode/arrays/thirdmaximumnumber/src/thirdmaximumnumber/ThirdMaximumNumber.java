package thirdmaximumnumber;

import java.util.TreeSet;

public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		
		  TreeSet<Integer> ts = new TreeSet<Integer>();
	        for (int n : nums) {
	            ts.add(n);
	            if (ts.size() > 3) { //if TreeSet size grows beyond 3 remove the first (smallest) element
	                ts.pollFirst(); //so that the 3rd element is always our third maximum number
	            }
	        }
	        return ts.size() < 3 ? ts.last() : ts.first();
	    }
	}

