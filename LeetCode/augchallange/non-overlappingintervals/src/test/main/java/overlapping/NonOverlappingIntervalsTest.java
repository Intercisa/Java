package main.java.overlapping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {

    @Test
    void eraseOverlapIntervals_1() {
        assertEquals(1, new NonOverlappingIntervals().eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}));
    }

    @Test
    void eraseOverlapIntervals_2() {
        assertEquals(2, new NonOverlappingIntervals().eraseOverlapIntervals(new int[][]{{1,2},{1,2},{1,2}}));
    }

    @Test
    void eraseOverlapIntervals_3() {
        assertEquals(0, new NonOverlappingIntervals().eraseOverlapIntervals(new int[][]{{1,2},{2,3}}));
    }
}