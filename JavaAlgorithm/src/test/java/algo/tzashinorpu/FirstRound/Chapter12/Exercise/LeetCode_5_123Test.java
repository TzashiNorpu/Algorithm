package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_123Test {

    @Test
    void maxProfit() {
        LeetCode_5_123 ins = new LeetCode_5_123();
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(ins.maxProfit(prices));
        int[] p2 = {1, 2, 3, 4, 5};
        System.out.println(ins.maxProfit(p2));
        int[] p3 = {7, 6, 4, 3, 1};
        System.out.println(ins.maxProfit(p3));

    }
}