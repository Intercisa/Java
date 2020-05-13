package findallnumbersdisappearedinanarray;

import java.util.ArrayList;

public class FindallNumbersDisappeared {

	public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {

			int temp = Math.abs(nums[i]) - 1;
			if (nums[temp] > 0)
				nums[temp] = -nums[temp];

		}

		for (int i = 0; i < nums.length; i++)
			if (nums[i] > 0)
				list.add(i + 1);

		return list;
	}

}
