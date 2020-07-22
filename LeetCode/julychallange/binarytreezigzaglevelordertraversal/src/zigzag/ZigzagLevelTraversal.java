package zigzag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		if (root == null) return res;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		boolean flag = false;
		while (!queue.isEmpty()) {
			int lvl = queue.size();
			List<Integer> subRes = new ArrayList<>();;

			for (int i = 0; i < lvl; i++) {
				TreeNode node = queue.poll();
				if(flag) subRes.add(0, node.val);
				else subRes.add(node.val);
				
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
			}
			res.add(subRes);
			flag = !flag;
		}
		return res;
	}
}
