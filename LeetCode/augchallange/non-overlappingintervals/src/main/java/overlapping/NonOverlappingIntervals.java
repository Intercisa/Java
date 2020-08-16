package main.java.overlapping;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) return 0;
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        int end =0, count = 1, len = intervals.length;

        for (int i = 1; i < len; i++) {
            if(intervals[i][0] >= intervals[end][1]){
                end = i;
                count++;
            }
        }
        return len - count;
    }
}
