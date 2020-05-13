package heightchecker;

import java.util.Arrays;

public class HeightChecker {
	public int heightChecker(int[] heights) {

		int res = 0;
		int[] tempArr = Arrays.copyOf(heights, heights.length);
		Arrays.sort(tempArr);
		
		for (int i = 0; i < tempArr.length; i++) 
			if(heights[i]!=tempArr[i])
				res++;
		
		return res;
	}
}
