package algo.tzashinorpu.SecondRound.Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findMin_153Test {

    @Test
    void findMin() {
        findMin_153 ins = new findMin_153();
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(ins.findMin(nums1));
        int[] nums2 = {4, 5, 6, 2, 3};
        System.out.println(ins.findMin(nums2));
        int[] nums3 = {1};
        System.out.println(ins.findMin(nums3));

    }
}