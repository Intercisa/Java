package main.java.myhashset;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {
   private MyHashSet mySet;
    @BeforeEach
    void initSet(){
        mySet = new MyHashSet();
        mySet.add(1);
        mySet.add(2);
    }

    @Test
    void add() {
        assertEquals(2, mySet.size());
        mySet.add(2);
        assertEquals(2, mySet.size());
    }

    @Test
    void remove() {
        mySet.remove(2);
        assertFalse(mySet.contains(2));
    }

    @Test
    void contains() {
        assertTrue(mySet.contains(1));
        assertFalse(mySet.contains(3));
        assertTrue(mySet.contains(2));
    }
}