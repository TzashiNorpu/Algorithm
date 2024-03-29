package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import algo.tzashinorpu.FirstRound.Chapter12.Exercise.LeetCode_5_198;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_198Test {

    @Test
    void rob() {
        LeetCode_5_198 ins = new LeetCode_5_198();

        int[] nums1 = {2, 1, 1, 2};
        System.out.println(ins.robRecursie(nums1));
        System.out.println(ins.robBottomUp(nums1));

        int[] nums2 = {2, 1, 1, 1, 2};
        System.out.println(ins.robRecursie(nums2));
        System.out.println(ins.robBottomUp(nums2));

        int[] nums3 = {226, 174, 214, 16, 218, 48, 153, 131, 128, 17, 157,
                142, 88, 43, 37, 157, 43, 221, 191, 68, 206, 23, 225, 82, 54, 118, 111, 46, 80,
                49, 245, 63, 25, 194, 72, 80, 143, 55, 209, 18, 55, 122, 65, 66, 177, 101, 63, 201, 172, 130, 103,
                225, 142, 46, 86, 185, 62, 138, 212, 192, 125, 77, 223, 188, 99, 228, 90, 25, 193, 211, 84, 239, 119, 234, 85, 83, 123/*,
                120, 131, 203, 219, 10, 82, 35, 120, 180, 249, 106, 37, 169, 225, 54, 103, 55, 166, 124*/};
        System.out.println(ins.robRecursie(nums3));
        System.out.println(ins.robBottomUp(nums3));
    }
}