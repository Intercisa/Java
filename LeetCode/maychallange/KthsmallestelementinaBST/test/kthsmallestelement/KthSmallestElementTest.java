package kthsmallestelement;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class KthSmallestElementTest {
	private KthSmallestElement smallest = new KthSmallestElement();
	private TreeNode root;
	@Test
	void test_1() {
		root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.left.right = new TreeNode(2);
		root.right = new TreeNode(4);
		
		assertEquals(1, smallest.kthSmallest(root, 1));
	}
	
	@Test
	void test_2() {
		root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.left.left = new TreeNode(2);
		root.left.left.left = new TreeNode(1);
		root.right = new TreeNode(6);
		
		assertEquals(3, smallest.kthSmallest(root, 3));
		
	}

}
