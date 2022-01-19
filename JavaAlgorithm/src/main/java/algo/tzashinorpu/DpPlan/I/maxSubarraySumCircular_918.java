package algo.tzashinorpu.DpPlan.I;

public class maxSubarraySumCircular_918 {
    public int maxSubarraySumCircular(int[] nums) {
//        对于环形数组，分两种情况。
//        (1)答案在数组中间，就是最大子序和。例如[1,-2,3,-2]；
//        (2)答案在数组两边，例如[5,-3,5]最大的子序和就等于数组的总和SUM-最小的子序和。(一种特殊情况是数组全为负数，也就是SUM-最小子序和==0，最大子序和等于数组中最大的那个)。
        // 有负数时 sum - 最小子序列 = 最大子序列 how to prove?
        // 3,10,2,-3,3,10,2,-3
        int maxTillHere = nums[0];
        int max = nums[0];
        int minTillHere = nums[0];
        int min = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (maxTillHere + nums[i] > nums[i]) {
                maxTillHere = maxTillHere + nums[i];
            } else {
                maxTillHere = nums[i];
            }
            max = Math.max(max, maxTillHere);

            if (minTillHere + nums[i] < nums[i]) {
                minTillHere = minTillHere + nums[i];
            } else {
                minTillHere = nums[i];
            }
            min = Math.min(min, minTillHere);
        }
        if (sum == min) {
            return max;
        }
        return Math.max(sum - min, max);
    }
}
