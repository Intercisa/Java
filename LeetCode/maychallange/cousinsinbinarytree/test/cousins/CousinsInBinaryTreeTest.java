package cousins;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CousinsInBinaryTreeTest {
	
	private CousinsInBinaryTree cousin = new CousinsInBinaryTree();

	@Test
	public void test_1() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.right = new TreeNode(3);
		int x = 4, y =3;
		
		assertEquals(false, cousin.isCousins(root, x, y));
		
	}
	
	@Test
	public void test_2() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(5);
		int x = 5, y =4;
		
		assertEquals(true, cousin.isCousins(root, x, y));
	}
	
	
	@Test
	public void test_3() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.right = new TreeNode(3);
		int x = 2, y =3;
		
		assertEquals(false, cousin.isCousins(root, x, y));
	}
	
}
