package goodpairs;

import java.util.ArrayList;
import java.util.List;

public class MaximumWealth {
    public static int maximumWealth(int[][] accounts) {
        List<Integer> accSums = new ArrayList<>();
        for (int[] account : accounts) {
            accSums.add(arraySum(account));
        }
        return accSums.stream().max(Integer::compareTo).get();
    }

    private static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
