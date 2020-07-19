package challenge;

public class Challenge1 {

	private static int[] nums = new int[10];
	public static void main(String[] args) {
		int[] numsToAdd = {59382, 43, 6894, 500, 99, -58};
		
		for (int i = 0; i < numsToAdd.length; i++) 
			nums[hash(numsToAdd[i])] = numsToAdd[i];
		
		for (int i = 0; i < nums.length; i++) 
			System.out.print(nums[i] + " ");
	}

	private static int hash(int value) {
		return Math.abs(value)%nums.length;
	}

}
