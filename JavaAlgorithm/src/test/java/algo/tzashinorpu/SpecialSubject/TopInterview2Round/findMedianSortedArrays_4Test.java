package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findMedianSortedArrays_4Test {

    @Test
    void findMedianSortedArrays() {
        findMedianSortedArrays_4 ins = new findMedianSortedArrays_4();
        int[] nums1_1 = {3};
        int[] nums2_1 = {1, 2};
        System.out.println(ins.findMedianSortedArrays(nums1_1, nums2_1));

        int[] nums1_2 = {1, 3};
        int[] nums2_2 = {2};
        System.out.println(ins.findMedianSortedArrays(nums1_2, nums2_2));
        int[] nums1_3 = {3, 4};
        int[] nums2_3 = {1, 2};
        System.out.println(ins.findMedianSortedArrays(nums1_3, nums2_3));

        int[] nums1_4 = {2, 4};
        int[] nums2_4 = {1, 3};
        System.out.println(ins.findMedianSortedArrays(nums1_4, nums2_4));

        int[] nums1_5 = {2, 4};
        int[] nums2_5 = {1, 2};
        System.out.println(ins.findMedianSortedArrays(nums1_5, nums2_5));
        int[] nums1_6 = {};
        int[] nums2_6 = {1, 2};
        System.out.println(ins.findMedianSortedArrays(nums1_6, nums2_6));
        int[] nums1_7 = {1};
        int[] nums2_7 = {2, 3, 4};
        System.out.println(ins.findMedianSortedArrays(nums1_7, nums2_7));
    }
}