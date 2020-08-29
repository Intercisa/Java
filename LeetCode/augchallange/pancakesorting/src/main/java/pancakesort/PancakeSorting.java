package main.java.pancakesort;

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> result = new ArrayList<>();
        int end = A.length;
        while (end != 0) {
            int index = find(A, end);
            flip(A, index);
            flip(A, end - 1);
            result.add(index + 1);
            result.add(end--);
        }
        return result;
    }

    private int find(int[] A, int target) {
        for (int i = 0; i < A.length; i++)
            if (A[i] == target) return i;

        return -1;
    }

    private void flip(int[] A, int end) {
        int start = 0;
        while (start < end) {
            int temp = A[start];
            A[start++] = A[end];
            A[end--] = temp;
        }
    }
}