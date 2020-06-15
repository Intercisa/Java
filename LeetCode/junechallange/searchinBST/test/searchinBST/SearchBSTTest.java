package searchinBST;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SearchBSTTest {

	@Test
	void test_1() {
		
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		
		assertEquals(root.left, new SearchBST().searchBST(root, 2));
	}
	
}
