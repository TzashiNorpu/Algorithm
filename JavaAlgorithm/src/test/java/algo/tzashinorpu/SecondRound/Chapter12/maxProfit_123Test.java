package algo.tzashinorpu.SecondRound.Chapter12;

import org.junit.jupiter.api.Test;

class maxProfit_123Test {

    @Test
    void maxProfit() {
        maxProfit_123 ins = new maxProfit_123();
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(ins.maxProfitDp(prices));
        System.out.println(ins.maxProfitGreedy(prices));
    }
}