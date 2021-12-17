package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_312Test {

    @Test
    void maxCoins() {
        LeetCode_5_312 ins = new LeetCode_5_312();
        int[] nums1 = {3, 1, 5, 8};
        System.out.println(ins.maxCoins(nums1));

        int[] nums2 = {1, 5};
        System.out.println(ins.maxCoins(nums2));
    }
}