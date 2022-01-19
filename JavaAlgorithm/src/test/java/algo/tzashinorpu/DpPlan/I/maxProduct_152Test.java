package algo.tzashinorpu.DpPlan.I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxProduct_152Test {

    @Test
    void maxProduct() {
        maxProduct_152 ins = new maxProduct_152();
        int[] nums1 = {2, 3, -2, 4};
        System.out.println(ins.maxProduct(nums1));

        int[] nums2 = {0, 2};
        System.out.println(ins.maxProduct(nums2));

        int[] nums3 = {-2};
        System.out.println(ins.maxProduct(nums3));
    }
}