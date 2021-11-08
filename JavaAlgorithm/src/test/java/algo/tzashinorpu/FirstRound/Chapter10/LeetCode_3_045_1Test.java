package algo.tzashinorpu.FirstRound.Chapter10;

import org.junit.jupiter.api.Test;

class LeetCode_3_045_1Test {

    @Test
    void jump() {
        int[] nums1 = {2, 3, 1, 1, 4};
        LeetCode_3_045_1 instance = new LeetCode_3_045_1();
        System.out.println(instance.jump(nums1));
        int[] nums2 = {1, 2, 1, 1, 1};
        System.out.println(instance.jump(nums2));
        int[] nums3 = {2, 1};
        System.out.println(instance.jump(nums3));
        int[] nums4 = {1, 1, 0, 1};
        System.out.println(instance.jump(nums4));
    }
}