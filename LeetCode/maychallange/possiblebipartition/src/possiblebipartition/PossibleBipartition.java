package possiblebipartition;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PossibleBipartition {
	//https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/537/week-4-may-22nd-may-28th/3342/discuss
	//dfs
	public boolean possibleBipartition(int N, int[][] dislikes) {
		if (N == 0 || dislikes.length == 0) return true;

	      List<Integer>[] graph = new ArrayList[N];
	        for (int i = 0; i < N; i++) graph[i] = new ArrayList<>(N);
	        
	        for (int i = 0; i < dislikes.length; i++) {
	            int a = dislikes[i][0] - 1;
	            int b = dislikes[i][1] - 1;
	            graph[a].add(b);
	            graph[b].add(a);
	        }
	        int[] color = new int[N];
	        color[0] = 1;
	        for (int i = 0; i < N; i++) 
	            if (!dfs(graph, i, color)) return false;
	        
	        return true; 
	}

    private boolean dfs(List<Integer>[] graph, int node, int[] color) {
        for (int i = 0; i < graph[node].size(); i++) {
            int op = graph[node].get(i);
            if (color[op] == 0) {
                color[op] = color[node] == 1 ? 2 : 1;
                if (!dfs(graph, op, color)) return false;
            } else if (color[op] == color[node]) return false;  
        }
        return true;
    }
    
    
    //bfs
    public boolean possibleBipartitionBfs(int N, int[][] dislikes) {
        int len = dislikes.length;
        if (len < 2) return true;
        int[] color = new int[N+1];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            List<Integer> tmp = new ArrayList<>();
            graph.add(tmp);
        }
        for (int i = 0; i < len; i++) {
            int m = dislikes[i][0];
            int n = dislikes[i][1];
            graph.get(m).add(n);
            graph.get(n).add(m);
        }
        for (int i = 1; i <= N; i++) {
            if (color[i] == 0) {
                color[i] = 1;
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                while (!q.isEmpty()) {
                    int cur = q.poll();
                    for (int j : graph.get(cur)) {
                        if (color[j] == 0) {
                            color[j] = color[cur] == 1 ? 2 : 1;
                            q.offer(j);
                        } else {
                            if (color[j] == color[cur]) return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}