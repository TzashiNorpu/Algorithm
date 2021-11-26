package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_045Test {

    @Test
    void jump() {
        LeetCode_5_045 ins = new LeetCode_5_045();
        int[] nums1 = {2, 1, 1, 1, 4};
        System.out.println(ins.jump(nums1));
        int[] nums2 = {2, 1};
        System.out.println(ins.jump(nums2));
        int[] nums3 = {2, 3, 1};
        System.out.println(ins.jump(nums3));
    }
}