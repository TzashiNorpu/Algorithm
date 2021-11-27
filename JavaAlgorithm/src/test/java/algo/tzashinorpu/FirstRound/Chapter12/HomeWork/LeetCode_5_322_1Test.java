package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_322_1Test {

    @Test
    void coinChange() {
        LeetCode_5_322_1 ins = new LeetCode_5_322_1();
        int[] coins1 = {2};
        System.out.println(ins.coinChange(coins1, 1));
        int[] coins2 = {2};
        System.out.println(ins.coinChange(coins2, 3));
        int[] coins3 = {186, 419, 83, 408};
        System.out.println(ins.coinChange(coins3, 6249));
        int[] coins4 = {1, 4, 5};
        System.out.println(ins.coinChange(coins4, 13));
    }
}