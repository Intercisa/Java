package maximumwidthofbinarytree;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MaximumWidthTest {

	@Test
	void test_1() {
		TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)), new TreeNode(2, null, new TreeNode(9)));
		assertEquals(4, new MaximumWidth().widthOfBinaryTree(root));
	}
	
	@Test
	void test_2() {
		TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)), null);
		assertEquals(2, new MaximumWidth().widthOfBinaryTree(root));
	}
	
	@Test
	void test_3() {
		TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
		assertEquals(2, new MaximumWidth().widthOfBinaryTree(root));
	}
	
	@Test
	void test_4() {
		TreeNode root = new TreeNode(1, 
				new TreeNode(3, 
						new TreeNode(5, 
								new TreeNode(6), null), null), 
				new TreeNode(2, null, 
						new TreeNode(9, null, 
								new TreeNode(7))));
		
		assertEquals(8, new MaximumWidth().widthOfBinaryTree(root));
	}
	
}
