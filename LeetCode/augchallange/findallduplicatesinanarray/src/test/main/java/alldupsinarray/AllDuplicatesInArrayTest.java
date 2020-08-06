package main.java.alldupsinarray;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllDuplicatesInArrayTest {

    @Test
    void findDuplicates() {
        assertEquals(List.of(2,3), new AllDuplicatesInArray().findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
}