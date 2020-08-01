package main.java.detectcapital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {

    @Test
    void detectCapitalUse() {
        assertTrue(new DetectCapital().detectCapitalUse("USA"));
    }

    @Test
    void detectCapitalUse_False() {
        assertFalse(new DetectCapital().detectCapitalUse("FlaG"));
    }
}