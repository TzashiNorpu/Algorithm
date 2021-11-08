package algo.tzashinorpu.FirstRound.Chapter11;

import org.junit.jupiter.api.Test;

class LeetCode_3_033_1Test {

    @Test
    void search() {
        int[] nums1 = {4, 5, 6, 7, 8, 1, 2};
        LeetCode_3_033_1 ins = new LeetCode_3_033_1();
//        System.out.println(ins.search(nums1, 1));
        int[] nums2 = {10, 11, 4, 5, 6, 7, 8};
        System.out.println(ins.search(nums2, 11));
    }
}