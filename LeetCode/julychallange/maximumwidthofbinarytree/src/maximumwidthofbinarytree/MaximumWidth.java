package maximumwidthofbinarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//dfs
//explanation: https://leetcode.com/problems/maximum-width-of-binary-tree/discuss/106654/JavaC%2B%2B-Very-simple-dfs-solution
public class MaximumWidth {
	public int widthOfBinaryTree(TreeNode root) {
		return dfs(root, 0, 1, new ArrayList<Integer>(), new ArrayList<Integer>());
	}

	private int dfs(TreeNode root, int level, int index, ArrayList<Integer> start, ArrayList<Integer> end) {
		if (root == null) return 0;
		
		if (start.size() == level) {
		
			start.add(index);
			end.add(index);
		
		}else end.set(level, index);
		
		
		int cur = end.get(level) - start.get(level) + 1;
		int left = dfs(root.left, level + 1, 2 * index, start, end);
		int right = dfs(root.right, level + 1, 2 * index + 1, start, end);
		return Math.max(cur, Math.max(left, right));
	}
	
	
    private int max = 1;
    public int widthOfBinaryTreeII(TreeNode root) {
        if (root == null) return 0;
        List<Integer> startOfLevel = new LinkedList<>();
        helper(root, 0, 1, startOfLevel);
        return max;
    }
    public void helper(TreeNode root, int level, int index, List<Integer> list) {
        if (root == null) return;
        if (level == list.size()) list.add(index);
        max = Math.max(max, index + 1 - list.get(level));
        helper(root.left, level + 1, index * 2, list);
        helper(root.right, level + 1, index * 2 + 1, list);
    }
	
}
