package stringvalidsequenceInbts;

public class StringValidSequenceInBTS {

	 private int index = 0;
	
	 public boolean isValidSequence(TreeNode root, int[] arr) {
		return checkForValidBTSSequence(root, arr, index);
	 }

	private boolean checkForValidBTSSequence(TreeNode node, int[] arr, int index) {
		 if (node == null  
				 || index >= arr.length 
				 || node.val != arr[index]) return false;

		 if(node.left == null && node.right == null && index == arr.length-1) return true;
		 
		 return checkForValidBTSSequence(node.left, arr, index+1) 
				 || checkForValidBTSSequence(node.right, arr, index+1);
	}
}