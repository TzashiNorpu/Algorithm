package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_714Test {

    @Test
    void maxProfit() {
        LeetCode_5_714 ins = new LeetCode_5_714();
        int[] prices1 = {1,3,2,8,4,9};
        int fee1 = 2;
        System.out.println(ins.maxProfit1(prices1, fee1));
        System.out.println(ins.maxProfit2(prices1, fee1));


        int[] prices2 = {1,5,7,5,10,3};
        int fee2 = 3;
        System.out.println(ins.maxProfit1(prices2, fee2));
        System.out.println(ins.maxProfit2(prices2, fee2));
    }
}