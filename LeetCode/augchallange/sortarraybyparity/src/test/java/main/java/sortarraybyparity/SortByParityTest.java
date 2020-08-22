package main.java.sortarraybyparity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortByParityTest {

    @Test
    void sortArrayByParity() {
        assertArrayEquals(new int[]{2,4,3,1}, new SortByParity().sortArrayByParity(new int[]{3,1,2,4}));
    }
}