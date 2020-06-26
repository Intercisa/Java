package sumroot;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SumRootTest {
	private TreeNode root;

	@Test
	void test_1() {
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		assertEquals(25, new SumRoot().sumNumbers(root));
	}
	
	@Test
	void test_2() {
		root = new TreeNode(4);
		root.left = new TreeNode(9);
		root.right = new TreeNode(0);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(1);
		
		assertEquals(1026, new SumRoot().sumNumbers(root));
	}
}
