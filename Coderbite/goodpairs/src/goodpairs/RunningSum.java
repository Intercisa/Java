package goodpairs;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            nums[i] = nums[i] + prev;
        }
        return nums;
    }
}
