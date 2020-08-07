package main.java.verticaltraversal;

import java.util.*;

public class VerticalTraversal {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        dfs(root, 0, 0, map);

        List<List<Integer>> res = new ArrayList<>();
        map.values().forEach(ys -> {
            res.add(new ArrayList<>());
            ys.values().forEach(nodes -> {
                while (!nodes.isEmpty()) res.get(res.size() - 1).add(nodes.poll());
            });
        });
        return res;
    }

    private void dfs(TreeNode root, int x, int y, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {
        if(root == null) return;
        if(!map.containsKey(x)) map.put(x, new TreeMap<>());
        if(!map.get(x).containsKey(y)) map.get(x).put(y, new PriorityQueue<>());

        map.get(x).get(y).offer(root.val);
        dfs(root.left, x - 1, y + 1, map);
        dfs(root.right, x + 1, y + 1, map);

    }
}



