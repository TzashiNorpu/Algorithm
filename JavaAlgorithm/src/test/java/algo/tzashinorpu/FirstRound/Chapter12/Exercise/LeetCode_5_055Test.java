package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_055Test {

    @Test
    void canJump() {
        LeetCode_5_055 ins = new LeetCode_5_055();
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(ins.canJump1(nums1));
        System.out.println(ins.canJump2(nums1));
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(ins.canJump1(nums2));
        System.out.println(ins.canJump2(nums2));

        int[] nums3 = {1, 0, 0, 5, 4};
        System.out.println(ins.canJump1(nums3));
        System.out.println(ins.canJump2(nums3));
    }
}