package subset;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		
		//explanation: https://www.geeksforgeeks.org/finding-all-subsets-of-a-given-set-in-java/
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> temp;
		
		// Run a loop for printing all 2^n 
        // subsets one by one 
		for (int i = 0; i < (1 << nums.length); i++) {
			temp = new ArrayList<Integer>();
			 // Print current subset 
			for (int j = 0; j < nums.length; j++)
				
				// (1<<j) is a number with jth bit 1 
                // so when we 'and' them with the 
                // subset number we get which numbers 
                // are present in the subset and which 
                // are not 
				if((i & (1 << j)) > 0)
					temp.add(nums[j]);
			
			res.add(temp);
		}
		return res; 
	}
	
	//https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3387/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)?page=2
    public List<List<Integer>> subsetsRec(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        backtrack(0, nums, new ArrayList<Integer>(),ans);
        return ans;
    }

	private void backtrack(int index, int[] nums, ArrayList<Integer> curr, List<List<Integer>> ans) {
		ans.add(new ArrayList<Integer>(curr));
		for (int i = index; i < nums.length; i++) {
			curr.add(nums[i]);
			backtrack(i+1, nums, curr, ans);
			curr.remove(curr.size()-1);
		}
		
	}
	//bfs - https://leetcode.com/problems/subsets/discuss/122645/3ms-easiest-solution-no-backtracking-no-bit-manipulation-no-dfs-no-bullshit
	public List<List<Integer>> subsetsII(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int n : nums){
            int size = result.size();
            for(int i=0; i<size; i++){
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(n);
                result.add(subset);
            }
        }
        return result;
    }

}
