package algo.tzashinorpu.ThirdRound.Chapter03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class threeSum_15Test {

    @Test
    void threeSum() {
        threeSum_15 ins = new threeSum_15();
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(ins.threeSum(nums1));
    }
}