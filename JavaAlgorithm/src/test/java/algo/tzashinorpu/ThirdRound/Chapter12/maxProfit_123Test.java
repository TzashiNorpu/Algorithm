package algo.tzashinorpu.ThirdRound.Chapter12;

import org.junit.jupiter.api.Test;

class maxProfit_123Test {

    @Test
    void maxProfit() {
        maxProfit_123 ins = new maxProfit_123();
        int[] prices = {1, 2, 3, 4, 5};
        System.out.println(ins.maxProfit(prices));
    }
}