package algo.tzashinorpu.WeekContest.D220626;

public class maximumsSplicedArray_5229 {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] diff1 = new int[n];
        int[] diff2 = new int[n];
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            diff1[i] = nums2[i] - nums1[i];
            diff2[i] = nums1[i] - nums2[i];
            sum1 += nums1[i];
            sum2 += nums2[i];
        }
        int sub1 = getMaxSubSum(diff1);
        int sub2 = getMaxSubSum(diff2);
        return Math.max(sum1 + sub1, sum2 + sub2);
    }

    private int getMaxSubSum(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int[] dp = new int[n];
        dp[0] = max;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
