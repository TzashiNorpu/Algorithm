package algo.tzashinorpu.ThirdRound.Chapter03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class merge_88Test {

    @Test
    void merge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge_88 ins = new merge_88();
        ins.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
        ;
    }
}