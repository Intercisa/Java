package count;

public class CountNodes {
	
	//explanation: https://www.programcreek.com/2014/06/leetcode-count-complete-tree-nodes-java/
	
	public int countNodes(TreeNode root) {
		if(root == null) return 0;
		return 1+ countNodes(root.left) + countNodes(root.right);
	}
	
	public int countNodesII(TreeNode root) {
		
		if(root == null) return 0;
		
		// Get the leftDepth of left subtree and right subtree to check which one is unfull tree
		int left = depthLeft(root.left);
		int right = depthLeft(root.right);
		
		if(left == right)
			//Left subtree is a full tree, and right subtree could be a non-full tree
			return (1 << left) + countNodes(root.right);
		else
			//Right subtree is a full tree, and left subtree could be a non-full tree
            return countNodes(root.left) + (1 << right);
	}
	
	private int depthLeft(TreeNode node) {
		int ans = 0;
		while (node != null) {
			ans++;
			node = node.left;
		}
		
		return ans;
	}
}


