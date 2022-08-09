package algo.tzashinorpu.WeekContest.D220731;

import java.util.Arrays;

public class minimumOperations_6132 {
    public int minimumOperations(int[] nums) {
        int res = 0;
        while (true) {
            int min = findMin(nums);
            if (min != 0) {
                res++;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        nums[i] -= min;
                    }
                }
            } else break;
        }
        return res;
    }

    private int findMin(int[] nums) {
        Arrays.sort(nums);
        int res = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != 0) res = Math.min(res, nums[i]);
        }
        return res;
    }
}
