package taskscheduler;

import java.util.Arrays;

public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
		if(n == 0) return tasks.length;
		int max = Integer.MIN_VALUE;
		
		int[] counts = new int[26];
		for (char c : tasks)  counts[ c - 'A']++;
		
		for (int count : counts) max = Math.max(max, count);
		
		max--;
		int idles = max * n + max;
		
		for (int count : counts) idles -= Math.min(max, count);
		
		return tasks.length + idles;
		
	}
	
	
	public int leastIntervalII(char[] tasks, int n) {
		
		int[] counts = new int[26];
		for (char c : tasks)  counts[ c - 'A']++;
		
		Arrays.sort(counts);
		int max = counts[25] - 1; // we don't need to wait the last time 
		
		int idle = max * n; // every time is the CPU do the task represented by max there will be an idle period  
		
		for(int i = 24; i >=0; i--)
			idle -= Math.min(counts[i], max); // we don't have to wait for other tasks so we subtract them 
		
		return idle > 0 ? idle + tasks.length : tasks.length;
		
	}
}
