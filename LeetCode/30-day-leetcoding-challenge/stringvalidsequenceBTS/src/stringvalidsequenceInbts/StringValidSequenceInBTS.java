package stringvalidsequenceInbts;

public class StringValidSequenceInBTS {

	 private int index = 0;

	 public boolean isValidSequence(TreeNode root, int[] arr) {
		return checkForValidBTSSequence(root, arr, index);
	 }

	private boolean checkForValidBTSSequence(TreeNode node, int[] arr, int index) {
		 if (node == null
				 || index >= arr.length //out of range
				 || node.val != arr[index]) return false; //self explanatory

		 if(node.left == null && node.right == null && index == arr.length-1) return true;
		 //if node.left or node.right not null, that's means there can be a sequence, but not a valid one >>
		 //arr = [0,1,1] but root = [0,1,0,0,1,0], arr can be found in there >> root.val = 0 root.left.val == 1 root.left.right.val == 1
		 //but root.left.right has more nodes so it can't be a valid sequence
		 //and if there are more numbers in arr when left or right is null that's mean they can't be a valid sequence either

		 return checkForValidBTSSequence(node.left, arr, index+1)
				 || checkForValidBTSSequence(node.right, arr, index+1);
	}
}
