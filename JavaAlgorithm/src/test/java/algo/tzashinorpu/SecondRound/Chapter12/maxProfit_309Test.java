package algo.tzashinorpu.SecondRound.Chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxProfit_309Test {

    @Test
    void maxProfit() {
        maxProfit_309 ins = new maxProfit_309();
        int[] prices = {1, 2, 3, 0, 2};
        System.out.println(ins.maxProfit(prices));
    }
}