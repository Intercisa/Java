package invertbinarytree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

	//iterative
	public TreeNode invertTree(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		if(root!= null) queue.add(root);
		
		while (!queue.isEmpty()) {
			TreeNode curr = queue.poll();
			if(curr.left != null)
				queue.add(curr.left);
			if(curr.right != null)
				queue.add(curr.right);
			
			TreeNode tmp = curr.left;
			curr.left = curr.right;
			curr.right = tmp;			
		}
		return root;
	}

	
	//recursive
	public TreeNode invertTreeRecur(TreeNode root) {
	    if(root==null) return root;
	 
	    TreeNode leftTmp=root.left;
	    root.left=invertTree(root.right);
	    root.right=invertTree(leftTmp);
	    
	    return root;
	}
	
	
}
