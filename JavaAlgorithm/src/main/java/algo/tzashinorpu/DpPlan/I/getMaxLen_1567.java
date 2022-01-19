package algo.tzashinorpu.DpPlan.I;

public class getMaxLen_1567 {
    public int getMaxLen(int[] nums) {
        // -1,-2,-3,-4,0,1 -> 4
        // -1,2,-3,-4,0,1 -> 3
        int length = nums.length;
        int maxLen = nums[0] > 0 ? 1 : 0;
        // 下标 i 结尾的乘积为正数的最长子数组长度
        int[] posDp = new int[length];
        int[] negDp = new int[length];
        // 下标 i 结尾的乘积为负数的最长子数组长度
        posDp[0] = nums[0] > 0 ? 1 : 0;
        negDp[0] = nums[0] < 0 ? 1 : 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] > 0) {
                posDp[i] = posDp[i - 1] + 1;
                if (negDp[i - 1] == 0) {
                    negDp[i] = 0;
                }
                if (negDp[i - 1] > 0) {
                    negDp[i] = negDp[i - 1] + 1;
                }
            }
            if (nums[i] < 0) {
                negDp[i] = posDp[i - 1] + 1;
                if (negDp[i - 1] > 0) {
                    posDp[i] = negDp[i - 1] + 1;
                }
                if (negDp[i - 1] == 0) {
                    posDp[i] = 0;
                }
            }
            maxLen = Math.max(maxLen, posDp[i]);
        }
        return maxLen;
    }
}
