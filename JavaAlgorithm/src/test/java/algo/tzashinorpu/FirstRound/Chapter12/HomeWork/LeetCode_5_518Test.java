package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_518Test {

    @Test
    void change() {
        LeetCode_5_518 ins = new LeetCode_5_518();
        int amount = 5;
        int[] coins = {1, 2, 5};
        System.out.println(ins.change1(amount, coins));
        System.out.println(ins.change2(amount, coins));
        System.out.println(ins.change3(amount, coins));
    }
}