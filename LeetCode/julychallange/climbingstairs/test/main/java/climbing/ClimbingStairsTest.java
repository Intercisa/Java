package main.java.climbing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void climbStairs() {
        assertEquals(2, new ClimbingStairs().climbStairs(2));
    }

    @Test
    void climbStairs_2() {
        assertEquals(3, new ClimbingStairs().climbStairs(3));
    }
}