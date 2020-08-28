package main.java.rand10;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class Rand10ImplTest {

    @Test
    void rand10() {
        IntStream.range(1, 1000).forEach(i ->{
            System.out.println(new Rand10Impl().rand10());});
    }
}