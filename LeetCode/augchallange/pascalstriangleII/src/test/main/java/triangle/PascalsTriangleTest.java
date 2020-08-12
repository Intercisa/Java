package main.java.triangle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    @Test
    void getRow_with_3() {
        assertEquals(List.of(1,3,3,1), new PascalsTriangle().getRow(3));
    }

    @Test
    void getRow_with_5() {
        assertEquals(List.of(1,5,10,10,5,1), new PascalsTriangle().getRow(5));
    }

    @Test
    void getRow_with_30() {
        assertEquals(List.of(
                1,30,435,4060,27405,142506,593775,2035800,5852925,14307150,30045015,54627300,86493225,119759850,145422675,155117520,
                145422675,119759850,86493225,54627300,30045015,14307150,5852925,2035800,593775,142506,27405,4060,435,30,1),
                new PascalsTriangle().getRow(30));
    }
}


