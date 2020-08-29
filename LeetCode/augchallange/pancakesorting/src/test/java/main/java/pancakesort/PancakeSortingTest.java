package main.java.pancakesort;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PancakeSortingTest {

    @Test
    void pancakeSort_NotAlreadySorted() {
        assertEquals(List.of(4,2,4,3), new PancakeSorting().pancakeSort(new int[]{3,2,4,1}));
    }

    @Test
    void pancakeSort_Sorted() {
        assertEquals(List.of(), new PancakeSorting().pancakeSort(new int[]{1,2,3}));
    }
}