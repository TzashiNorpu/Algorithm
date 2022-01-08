package algo.tzashinorpu.SecondRound.Chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class splitArray_410Test {

    @Test
    void splitArray() {
        splitArray_410 ins = new splitArray_410();
        int[] nums1 = {7, 2, 5, 10, 8};
        int m1 = 2;
        System.out.println(ins.splitArrayDp(nums1, m1));
        System.out.println(ins.splitArrayDivide(nums1, m1));
        int[] nums2 = {1, 2, 3, 4, 5};
        int m2 = 2;
        System.out.println(ins.splitArrayDp(nums2, m2));
        System.out.println(ins.splitArrayDivide(nums2, m2));
    }
}