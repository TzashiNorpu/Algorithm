package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_1010Test {

    @Test
    void numPairsDivisibleBy60() {
        LeetCode_1010 ins1 = new LeetCode_1010();
        int[] nums1 = {30, 20, 150, 100, 40};
        System.out.println(ins1.numPairsDivisibleBy60Dfs(nums1));
        System.out.println(ins1.numPairsDivisibleBy60(nums1));
        LeetCode_1010 ins2 = new LeetCode_1010();
        int[] nums2 = {60, 60, 60};
        System.out.println(ins2.numPairsDivisibleBy60Dfs(nums2));
        System.out.println(ins2.numPairsDivisibleBy60(nums2));
        LeetCode_1010 ins3 = new LeetCode_1010();
        int[] nums3 = {30, 30, 30, 30};
        System.out.println(ins3.numPairsDivisibleBy60Dfs(nums3));
        System.out.println(ins3.numPairsDivisibleBy60(nums3));
    }
}