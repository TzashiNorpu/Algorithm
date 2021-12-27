package algo.tzashinorpu.SecondRound.Chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class jump_045Test {

    @Test
    void jump() {
        jump_045 ins = new jump_045();
        int[] nums1 = {1, 1, 1, 1, 1};
        System.out.println(ins.jump(nums1));

        int[] nums2 = {2, 3, 1, 1, 4};
        System.out.println(ins.jump(nums2));
    }
}