package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

class LeetCode_312Test {

    @Test
    void maxCoinsDfs() {
        LeetCode_312 ins = new LeetCode_312();
        int[] nums1 = {7, 9, 8, 0, 7, 1, 3, 5, 5, 2, 3};
        System.out.println(ins.maxCoinsBackTrack(nums1));
        System.out.println(ins.maxCoinsDp(nums1));
    }
}