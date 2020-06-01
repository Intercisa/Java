package invertbinarytree;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {
	
	
	@Test
	void test_1() {
		
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(7);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		
		InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
		invertBinaryTree.invertTree(root);
		
		
		assertEquals(7, root.left.val);
		
		
	}
	

	


}
