package threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null)return null;
		List<List<Integer>> list = new ArrayList<>();
		if (nums.length == 0) return list;
		
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int target = -nums[i];
				int start = i + 1;
				int end = nums.length - 1;
				while (start < end) {
					if ((nums[start] + nums[end]) == target) {
						list.add(Arrays.asList(nums[i], nums[start], nums[end]));
						while (start < end && nums[start] == nums[start + 1])
							start++;
						while (start < end && nums[end] == nums[end - 1])
							end--;
						start++;
						end--;
					} else if ((nums[start] + nums[end]) < target) {
						start++;
					} else {
						end--;
					}
				}
			}
		}
		return list;
	}

	public List<List<Integer>> threeSumII(int[] nums) {
		if (nums == null)return null;
		int N = nums.length;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Map<String, List<Integer>> tripMap = new HashMap<String, List<Integer>>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			int start = i + 1;
			int end = nums.length - 1;
			while (start < end) {
				if (nums[i] + nums[start] + nums[end] == 0) {
					List<Integer> trip = new ArrayList(
							Arrays.asList(new Integer[] { nums[i], nums[start], nums[end] }));
					String key = nums[i] + "" + nums[start] + nums[end];
					if (!tripMap.containsKey(key)) {
						res.add(trip);

						tripMap.put(key, trip);
					}
					start++;
					end--;
				} else if (nums[i] + nums[start] + nums[end] < 0) {
					start++;
				} else {
					end--;
				}
			}

		}
		return res;
	}

}
