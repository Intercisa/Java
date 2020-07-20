package binarysearchtrees;

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(int data) {
		this.data = data;
	}

	public void insert(int value) {
		if(this.data == value) return;
		
		if(value < this.data) {
			if(leftChild != null) leftChild.insert(value);
			else leftChild = new TreeNode(value);
		}else {
			if(rightChild != null) rightChild.insert(value);
			else rightChild = new TreeNode(value);
		}
	}
	
	public void traverseInOrder() {
		if(leftChild != null )
			this.leftChild.traverseInOrder();
		System.out.print(data + ", ");
		if(rightChild != null)
			this.rightChild.traverseInOrder();
	}
	
	public void traversePreOrder() {
		System.out.print(data + ", ");
		if(leftChild != null ) 
			this.leftChild.traversePreOrder();
			
		if(rightChild != null) 
			this.rightChild.traversePreOrder();;
	}
	
	public void traversePostOrder() {
		if(leftChild != null )
			this.leftChild.traversePostOrder();
		if(rightChild != null)
			this.rightChild.traversePostOrder();
		System.out.print(data + ", ");
	}
	
	public TreeNode get(int value) {
		if(this.data == value) return this;
		
		if(value < this.data) {
			if(leftChild != null) return leftChild.get(value);
		}else {
			if(rightChild != null) return rightChild.get(value);
		}
		return null;
	}
	
	public TreeNode getMaxNode() {
		if(rightChild == null) return this;
		return rightChild.getMaxNode();
	}
	
	public int getMax() {
		return getMaxNode().data;
	}
	
	public TreeNode getMinNode() {
		if(leftChild == null) return this;
		return leftChild.getMinNode();
	}
	
	public int getMin() {
		return getMinNode().data;
	}
	
	public int getData() {return data;}
	public void setData(int data) {this.data = data;}
	public TreeNode getLeftChild() {return leftChild;}
	public void setLeftChild(TreeNode leftChild) {this.leftChild = leftChild;}
	public TreeNode getRightChild() {return rightChild;}
	public void setRightChild(TreeNode rightChild) {this.rightChild = rightChild;}

	@Override
	public String toString() {
		return String.format("TreeNode [data=%s]", data);
	}
}
