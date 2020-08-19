package main.java.consecutivedifferences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveDifferencesTest {

    @Test
    void numsSameConsecDiff_1() {
        assertArrayEquals(new int[]{181,292,707,818,929}, new ConsecutiveDifferences().numsSameConsecDiff(3,7));
    }

    @Test
    void numsSameConsecDiff_2() {
        assertArrayEquals(new int[]{10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98}, new ConsecutiveDifferences().numsSameConsecDiff(2,1));
    }
}