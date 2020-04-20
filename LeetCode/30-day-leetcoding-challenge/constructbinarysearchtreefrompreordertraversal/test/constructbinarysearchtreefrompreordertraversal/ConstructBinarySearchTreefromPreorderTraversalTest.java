package constructbinarysearchtreefrompreordertraversal;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ConstructBinarySearchTreefromPreorderTraversalTest {

	/*
	 * it's not a really good test, don't make tests like this in productions 
	 * 
	 */
	
	ConstructBinarySearchTreefromPreorderTraversal binarySearchTreefromPreorderTraversal =
			new ConstructBinarySearchTreefromPreorderTraversal();
	

	
	@Test
	void test_1_for_first_left() {	
		assertEquals(TreeNode.getDummyHead().left.val, binarySearchTreefromPreorderTraversal.bstFromPreorder(new int[] {8,5,1,7,10,12}).left.val);
	}
	

	@Test
	void test_2_for_first_right() {	
		assertEquals(TreeNode.getDummyHead().right.val, binarySearchTreefromPreorderTraversal.bstFromPreorder(new int[] {8,5,1,7,10,12}).right.val);
	}


}
