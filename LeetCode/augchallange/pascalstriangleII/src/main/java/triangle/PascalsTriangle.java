package main.java.triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);

        long multiplier = 1;
        int n = rowIndex;
        for (int i = 1; i <=rowIndex; i++) {
             long partial = multiplier * n-- / i;
             res.add((int) partial);
             multiplier = partial;
        }
        return res;
    }
}
