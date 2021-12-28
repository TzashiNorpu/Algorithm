package algo.tzashinorpu.ThirdRound.Chapter10;

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

        int[] nums3 = {4, 0, 0, 0, 0};
        System.out.println(ins.jump(nums3));

        int[] nums4 = {3, 0, 0, 1, 0};
        System.out.println(ins.jump(nums4));

        int[] nums5 = {3, 0, 2, 0, 0};
        System.out.println(ins.jump(nums5));
    }
}