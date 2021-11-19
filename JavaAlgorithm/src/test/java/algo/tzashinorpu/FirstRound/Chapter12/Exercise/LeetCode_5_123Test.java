package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import algo.tzashinorpu.FirstRound.Chapter12.Exercise.LeetCode_5_123;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_123Test {

    @Test
    void maxProfit() {
        LeetCode_5_123 ins = new LeetCode_5_123();
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(ins.maxProfit1(prices));
        System.out.println(ins.maxProfit2(prices));
        int[] p2 = {1, 2, 3, 4, 5};
        System.out.println(ins.maxProfit1(p2));
        System.out.println(ins.maxProfit2(p2));
        int[] p3 = {7, 6, 4, 3, 1};
        System.out.println(ins.maxProfit1(p3));
        System.out.println(ins.maxProfit2(p3));
        int[] p4 = {14, 9, 10, 12, 4, 8, 1, 16};
        System.out.println(ins.maxProfit1(p4));
        System.out.println(ins.maxProfit2(p4));

    }
}