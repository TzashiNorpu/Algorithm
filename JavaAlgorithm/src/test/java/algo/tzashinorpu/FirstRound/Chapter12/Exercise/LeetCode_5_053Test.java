package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import org.junit.jupiter.api.Test;

class LeetCode_5_053Test {

    @Test
    void maxSubArray1() {
        LeetCode_5_053 instance = new LeetCode_5_053();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(instance.maxSubArray1(nums));
    }

    @Test
    void maxSubArray2() {
        LeetCode_5_053 instance = new LeetCode_5_053();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(instance.maxSubArray2(nums));
    }

    @Test
    void maxSubArrayDP() {
        LeetCode_5_053 instance = new LeetCode_5_053();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(instance.maxSubArrayDP(nums));
    }

    @Test
    void maxSubArrayGreedy() {
        LeetCode_5_053 instance = new LeetCode_5_053();
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(instance.maxSubArrayGreedy(nums1));
        int[] nums2 = {-2, -1, -3};
        System.out.println(instance.maxSubArrayGreedy(nums2));
    }

    @Test
    void maxSubArrayDivide() {
        LeetCode_5_053 instance = new LeetCode_5_053();
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(instance.maxSubArrayDivide(nums1));
    }
}