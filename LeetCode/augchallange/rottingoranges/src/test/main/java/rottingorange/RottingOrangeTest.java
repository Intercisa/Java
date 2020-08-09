package main.java.rottingorange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RottingOrangeTest {
    @Test
    void orangesRotting() {
        assertEquals(4, new RottingOrange().orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
    }
    @Test
    void orangesRotting_2() {
        assertEquals(-1, new RottingOrange().orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}}));
    }
    @Test
    void orangesRotting_3() {
        assertEquals(0, new RottingOrange().orangesRotting(new int[][]{{0,2}}));
    }
}