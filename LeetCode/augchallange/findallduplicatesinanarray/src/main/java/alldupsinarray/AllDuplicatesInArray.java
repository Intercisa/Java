package main.java.alldupsinarray;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums) {
        // when find a number i, flip the number at position i-1 to negative.
        // if the number at position i-1 is already negative, i is the number that occurs twice.
        // these works only because ->  1 ≤ a[i] ≤ n (n = size of array)
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int elem = Math.abs(nums[i]);
            if(nums[elem-1] < 0) res.add(Math.abs(elem));
            nums[elem-1] = - nums[elem-1];
        }
        return res;
    }
}