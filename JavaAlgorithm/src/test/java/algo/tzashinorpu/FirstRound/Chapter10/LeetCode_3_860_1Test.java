package algo.tzashinorpu.FirstRound.Chapter10;

import org.junit.jupiter.api.Test;

class LeetCode_3_860_1Test {

    @Test
    void lemonadeChange() {
        int[] bills = {5, 5, 5, 10, 20};
        LeetCode_3_860_1 instance = new LeetCode_3_860_1();
        System.out.println(instance.lemonadeChange(bills));
        int[] bills1 = {5, 5, 10, 10, 20};
        System.out.println(instance.lemonadeChange(bills1));
    }
}