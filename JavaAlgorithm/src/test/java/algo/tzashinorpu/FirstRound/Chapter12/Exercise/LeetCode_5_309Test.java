package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_309Test {

    @Test
    void maxProfit() {
        LeetCode_5_309 ins = new LeetCode_5_309();
        int[] prices1 = {1, 2, 5, 0, 2};
        System.out.println(ins.maxProfit1(prices1));
        System.out.println(ins.maxProfit2(prices1));
        int[] prices2 = {1, 2, 3, 0, 2};
        System.out.println(ins.maxProfit1(prices2));
        System.out.println(ins.maxProfit2(prices2));
    }
}