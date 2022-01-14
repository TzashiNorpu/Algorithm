package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class kSmallestPairs_373Test {

    @Test
    void kSmallestPairsSmallHeap() {
        kSmallestPairs_373 ins = new kSmallestPairs_373();

        int[] nums1_1 = {1, 7, 11};
        int[] nums2_1 = {2, 4, 6};
        int k1 = 3;
        System.out.println(ins.kSmallestPairsSmallHeap(nums1_1, nums2_1, k1));
        System.out.println(ins.kSmallestPairsMerge(nums1_1, nums2_1, k1));

        int[] nums1_2 = {1, 1, 2};
        int[] nums2_2 = {1, 2, 3};
        int k2 = 2;
        System.out.println(ins.kSmallestPairsSmallHeap(nums1_2, nums2_2, k2));
        System.out.println(ins.kSmallestPairsMerge(nums1_2, nums2_2, k2));

        int[] nums1_3 = {1, 2};
        int[] nums2_3 = {3};
        int k3 = 3;
        System.out.println(ins.kSmallestPairsSmallHeap(nums1_3, nums2_3, k3));
        System.out.println(ins.kSmallestPairsMerge(nums1_3, nums2_3, k3));

        int[] nums1_4 = {1, 1, 2};
        int[] nums2_4 = {1, 2, 3};
        int k4 = 10;
        System.out.println(ins.kSmallestPairsSmallHeap(nums1_4, nums2_4, k4));
        System.out.println(ins.kSmallestPairsMerge(nums1_4, nums2_4, k4));
    }

}