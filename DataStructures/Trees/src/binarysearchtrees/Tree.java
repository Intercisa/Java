package binarysearchtrees;

public class Tree {
	
	private TreeNode root;
	
	public void insert(int value) {
		if(root == null) root = new TreeNode(value);
		else root.insert(value);
	}
	
	public void traversInOrder() {
		if(root != null) root.traverseInOrder();
	}
	
	public TreeNode get(int value) {
		return root.get(value);
	}
	
	public TreeNode getMaxNode() {
		if(root == null) return null;
		return root.getMaxNode();
	}
	public int max() {
		if(root == null) return Integer.MAX_VALUE;
		return root.getMax();
	}
	
	public TreeNode getMinNode() {
		if(root == null) return null;
		return root.getMinNode();
	}
	public int min() {
		if(root == null) return Integer.MIN_VALUE;
		return root.getMin();
	}
}
