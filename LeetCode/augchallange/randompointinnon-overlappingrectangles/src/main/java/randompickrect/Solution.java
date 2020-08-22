package main.java.randompickrect;

import java.util.Random;
import java.util.TreeMap;

// explanation: https://massivealgorithms.blogspot.com/2018/12/leetcode-497-random-point-in-non.html
public class Solution {
    private final int[][]rects;
    private final Random rand;
    private final TreeMap<Integer, Integer> map;
    private int area;

    public Solution(int[][] rects) {
        this.rects = rects;
        this.rand = new Random();
        this.map = new TreeMap<>();
        area = 0;
        initMap();
    }

    public int[] pick() {
        int randInt = rand.nextInt(area);
        int key = map.higherKey(randInt);
        int[] rect = rects[map.get(key)];
        int x = rect[0] + (key - randInt - 1) % (rect[2] - rect[0] + 1);
        int y = rect[1] + (key - randInt - 1) / (rect[2] - rect[0] + 1);
        return new int[]{x, y};
    }

    private void initMap() {
        /* add weight for each rectangle by their area
           WARNING: we need to add 1 for every length and width, because number of points if one greater then value of size
           eg: if len = 2, then there exist max number of points = 3 on this line */
        for (int i = 0; i < rects.length; i++) {
            area += (rects[i][2] - rects[i][0] + 1) * (rects[i][3] - rects[i][1] + 1);
            map.put(area, i);
        }
    }
}
