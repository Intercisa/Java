package main.java.buyandsell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyAndSellStockIIITest {

    @Test
    void maxProfit_1() {
         assertEquals(6, new BuyAndSellStockIII().maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

    @Test
    void maxProfit_2() {
        assertEquals(4, new BuyAndSellStockIII().maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    void maxProfit_3() {
        assertEquals(0, new BuyAndSellStockIII().maxProfit(new int[]{7,6,4,3,1}));
    }
}