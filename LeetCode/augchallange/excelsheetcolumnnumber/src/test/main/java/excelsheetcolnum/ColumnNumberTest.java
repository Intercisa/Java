package main.java.excelsheetcolnum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColumnNumberTest {

    @Test
    void titleToNumberWith_A() {
        assertEquals(1, new ColumnNumber().titleToNumber("A"));
    }

    @Test
    void titleToNumberWith_AB() {
        assertEquals(28, new ColumnNumber().titleToNumber("AB"));
    }

    @Test
    void titleToNumberWith_ZY() {
        assertEquals(701, new ColumnNumber().titleToNumber("ZY"));
    }
}