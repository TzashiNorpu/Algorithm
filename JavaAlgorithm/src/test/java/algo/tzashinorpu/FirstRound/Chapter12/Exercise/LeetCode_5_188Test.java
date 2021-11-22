package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_188Test {

    @Test
    void maxProfit() {
        LeetCode_5_188 ins = new LeetCode_5_188();
        int[] prices = { 3, 2, 6, 5, 0, 3 };
        int k = 2;
        System.out.println(ins.maxProfit1(k, prices));
        System.out.println(ins.maxProfit2(k, prices));
    }
}