package algo.tzashinorpu.WeekContest.D1226;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class E5966Test {

    @Test
    void recoverArray() {
        E5966 ins = new E5966();
        int[] nums1 = {2, 10, 6, 4, 8, 12};
        int[] nums2 = {1, 50, 99, 101, 150, 199};
        System.out.println(Arrays.toString(ins.recoverArray(nums1)));
        System.out.println(Arrays.toString(ins.recoverArray(nums2)));
    }
}