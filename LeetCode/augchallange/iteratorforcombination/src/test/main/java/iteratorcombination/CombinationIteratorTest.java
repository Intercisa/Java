package main.java.iteratorcombination;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationIteratorTest {

    private CombinationIterator iterator;
    @BeforeEach
    void init(){
        iterator = new CombinationIterator("abc", 2);
    }

    @Test
    void nextAndHasNext() {
        assertEquals("ab", iterator.next());

        assertTrue(iterator.hasNext());

        assertEquals("ac", iterator.next());

        assertTrue(iterator.hasNext());

        assertEquals("bc", iterator.next());

        assertFalse(iterator.hasNext());
    }
}