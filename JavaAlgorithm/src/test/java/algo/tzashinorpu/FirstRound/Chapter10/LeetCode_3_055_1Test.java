package algo.tzashinorpu.FirstRound.Chapter10;

import org.junit.jupiter.api.Test;

class LeetCode_3_055_1Test {

    @Test
    void canJump() {
        int[] nums = {0, 3, 1, 1, 4};
        LeetCode_3_055_1 instance = new LeetCode_3_055_1();
        System.out.println(instance.canJump1(nums));
        System.out.println(instance.canJump2(nums));
    }
}