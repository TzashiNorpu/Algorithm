package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_152 {
    // dp1
    public int maxProduct1(int[] nums) {
        int iMax = 1;
        int iMin = 1;
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = iMax;
                iMax = iMin;
                iMin = temp;
            }
            iMax = Math.max(iMax * nums[i], nums[i]);
            iMin = Math.min(iMin * nums[i], nums[i]);
            Max = Math.max(Max, iMax);
        }
        return Max;
    }

    // dp2
    public int maxProduct2(int[] nums) {
        int max = nums[0];
        int[] maxDp = new int[nums.length];
        int[] minDp = new int[nums.length];
        maxDp[0] = nums[0];
        minDp[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            maxDp[i + 1] = Math.max(nums[i + 1], Math.max(maxDp[i] * nums[i + 1], minDp[i] * nums[i + 1]));
            minDp[i + 1] = Math.min(nums[i + 1], Math.min(maxDp[i] * nums[i + 1], minDp[i] * nums[i + 1]));
            max = Math.max(max, maxDp[i + 1]);
        }
        return max;
    }

    // dp3
    public int maxProduct3(int[] nums) {
        int max = nums[0];
        int iMax = nums[0];
        int iMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = iMax;
            iMax = Math.max(Math.max(temp * nums[i], iMin * nums[i]), nums[i]);
            iMin = Math.min(Math.min(temp * nums[i], iMin * nums[i]), nums[i]);
            max = Math.max(iMax, max);
        }
        return max;
    }
}
