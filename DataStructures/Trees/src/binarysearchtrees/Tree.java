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
	public void traversPreOrder() {
		if(root != null) root.traversePreOrder();
	}
	
	public void traversPostOrder() {
		if(root != null) root.traversePostOrder();
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
	
	public void delete(int value) {
		root = delete(root, value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot, int value) {
		if(subtreeRoot == null) return subtreeRoot;
		if(value < subtreeRoot.getData())
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),value));
		else if(value > subtreeRoot.getData())
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
		else {
			//cases 1 an 2: node to delete has 0 or 1 child(ren)
			if(subtreeRoot.getLeftChild() == null)
				return subtreeRoot.getRightChild();
			else if(subtreeRoot.getRightChild() == null)
				return subtreeRoot.getLeftChild();
			//case 3: node to delete has 2 children 
			
			//replace the value in the subtreeRoot node with the smallest value
			//from the right subtree
			subtreeRoot.setData(subtreeRoot.getRightChild().getMin());
			
			//delete the node that has the smallest value in the right subtree
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
			
		}
		return subtreeRoot;
	}
}
