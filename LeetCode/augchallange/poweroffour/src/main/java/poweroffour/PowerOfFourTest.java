package main.java.poweroffour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfFourTest {

    @Test
    void isPowerOfFour() {
        assertTrue(new PowerOfFour().isPowerOfFour(16));
    }

    @Test
    void isPowerOfFour_2() {
        assertFalse(new PowerOfFour().isPowerOfFour(5));
    }

    @Test
    void isPowerOfFour_3() {
        assertTrue(new PowerOfFour().isPowerOfFour(1));
    }
}