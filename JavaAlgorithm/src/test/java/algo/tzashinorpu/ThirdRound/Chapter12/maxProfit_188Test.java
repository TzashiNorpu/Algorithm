package algo.tzashinorpu.ThirdRound.Chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxProfit_188Test {

    @Test
    void maxProfit() {
        maxProfit_188 ins = new maxProfit_188();
        int[] prices = {2, 4, 1};
        int k = 2;
        System.out.println(ins.maxProfit(k, prices));
    }
}