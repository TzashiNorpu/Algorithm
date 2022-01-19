package algo.tzashinorpu.DpPlan.I;

import java.util.Arrays;

public class maxProduct_152 {
    public int maxProduct(int[] nums) {
        // 2,3,-2,3,-2,4
        int length = nums.length;
        int[] maxDp = new int[length];
        maxDp[0] = nums[0];
        int[] minDp = new int[length];
        minDp[0] = nums[0];
        for (int i = 1; i < length; i++) {
            maxDp[i] = Math.max(Math.max(maxDp[i - 1] * nums[i], nums[i]), minDp[i - 1] * nums[i]);
            minDp[i] = Math.min(Math.min(maxDp[i - 1] * nums[i], nums[i]), minDp[i - 1] * nums[i]);
        }
        return Arrays.stream(maxDp).max().getAsInt();
    }
}
