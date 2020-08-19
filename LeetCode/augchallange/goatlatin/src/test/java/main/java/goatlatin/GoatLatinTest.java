package main.java.goatlatin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoatLatinTest {

    @Test
    void toGoatLatin_1() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", new GoatLatin().toGoatLatin("I speak Goat Latin"));
    }

    @Test
    void toGoatLatin_2() {
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                new GoatLatin().toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}