package randompickwithweight;

import java.util.Random;
import java.util.TreeMap;

public class Solution {

	private TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	private Random random = new Random();
	private int count;
	
	public Solution(int[] w) {
		for (int i = 0; i < w.length; i++) {
			count += w[i];
			map.put(count, i);
		}	
	}

	public int pickIndex() {
		
		int key = map.higherKey(random.nextInt(count));
		return map.get(key);
	}
}
