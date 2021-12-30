package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_846Test {

    @Test
    void isNStraightHand2() {
        LeetCode_846 ins = new LeetCode_846();
        int[] hand = {1, 1, 2, 2, 3, 3};
        int groupSize = 3;
        System.out.println(ins.isNStraightHand2(hand, groupSize));
    }
}