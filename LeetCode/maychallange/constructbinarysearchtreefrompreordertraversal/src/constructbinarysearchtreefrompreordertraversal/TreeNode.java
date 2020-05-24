package constructbinarysearchtreefrompreordertraversal;

public class TreeNode {
	
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) {this.val = x;}
	
	public static TreeNode getDummyHead () {
		
		TreeNode head = new TreeNode(8);
		head.left = new TreeNode(5);
		head.right = new TreeNode(10);
		head.left.left = new TreeNode(1);
		head.left.right = new TreeNode(7);
		head.right.right = new TreeNode(12);
		
		return head;	
	}
	
	
	public static void printInorder(TreeNode node) { 
        if (node == null) return; 
         
        printInorder(node.left); 
        System.out.print(node.val + " "); 
        printInorder(node.right); 
    } 
	
	
}
