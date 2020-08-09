package main.java.rottingorange;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOrange {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        Queue<int[]> qu = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    qu.offer(new int[]{i, j});
                }
            }
        }

        int[][] direction = {{1,0}, {0,1}, {0,-1}, {-1, 0}};

        int level = 0;
        while (!qu.isEmpty()) {
            level++;
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                int[] rotten = qu.poll();
                for (int[] dir : direction) {
                    int nx = dir[0] + rotten[0];
                    int ny = dir[1] + rotten[1];

                    if (nx < 0 || ny < 0 || nx >= grid.length || ny >= grid[0].length || grid[nx][ny] != 1) continue;

                    grid[nx][ny] = 2;
                    qu.offer(new int[]{nx, ny});
                }
            }
        }
        for (int[] x : grid) {
            for (int y : x)
                if (y == 1) return -1;
        }
        return level == 0 ? 0 : level - 1;
    }
}
