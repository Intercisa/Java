package main.java.distributecandiestopeople;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributeCandiesTest {

    @Test
    void distributeCandies_1() {
        assertArrayEquals(new int[]{1,2,3,1}, new DistributeCandies().distributeCandies(7,4));
    }

    @Test
    void distributeCandies_2() {
        assertArrayEquals(new int[]{5,2,3}, new DistributeCandies().distributeCandies(10,3));
    }
}