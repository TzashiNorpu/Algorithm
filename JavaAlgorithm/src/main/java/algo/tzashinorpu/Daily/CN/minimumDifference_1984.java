package algo.tzashinorpu.Daily.CN;

import java.util.Arrays;

public class minimumDifference_1984 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            diff = Math.min(diff, nums[i + k - 1] - nums[i]);
        }
        return diff;
    }
}
