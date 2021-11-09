package algo.tzashinorpu.FirstRound.Chapter11;

import org.junit.jupiter.api.Test;

class LeetCode_3_153_1Test {

    @Test
    void findMin() {
        int[] nums = {3, 4, 5, 1, 2};
        LeetCode_3_153_1 ins = new LeetCode_3_153_1();
        System.out.println(ins.findMin(nums));
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(ins.findMin(nums2));
        int[] nums3 = {4, 5, 1, 2, 3};
        System.out.println(ins.findMin(nums3));
    }
}