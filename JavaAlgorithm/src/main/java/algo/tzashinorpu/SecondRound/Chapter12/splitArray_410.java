package algo.tzashinorpu.SecondRound.Chapter12;

import java.util.Arrays;

public class splitArray_410 {
    public int splitArrayDp(int[] nums, int m) {
        /*令 f[i][j] 表示将数组的前 i 个数分割为 j 段所能得到的最大连续子数组和的最小值。
        在进行状态转移时，我们可以考虑第 j 段的具体范围，即我们可以枚举 k，其中前 k 个数被分割为 j−1 段，而第 k+1 到第 i 个数为第 j 段。此时，
        这 j 段子数组中和的最大值，就等于 f[k][j−1] 与 sum(k+1,i) 中的较大值，其中 sum(i,j) 表示数组 nums 中下标落在区间 [i,j] 内的数的和*/
        // nums = [7,2,5,10,8], m = 2 -> 18
        // 1,2,3 -> [1|2,3],[1,2|3]
        // dp[3][2] = {[dp[1][1],sum[2,3]],[dp[2][1],sum[3]]}
        int length = nums.length;
        int[][] dp = new int[length + 1][m + 1];
        for (int i = 0; i <= length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        int[] sum = new int[length + 1];
        for (int i = 1; i <= length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
            // dp[i][1]
            dp[i][1] = sum[i];
        }
        for (int i = 1; i <= length; i++) {
            for (int j = 2; j <= Math.min(i, m); j++) {
                //dp[3][1]
                for (int k = 1; k < i; k++) {
                    dp[i][j] = Math.min(Math.max(dp[k][j - 1], sum[i] - sum[k]), dp[i][j]);
                }
            }
        }
        return dp[length][m];
    }


    public int splitArrayDivide(int[] nums, int m) {
        int lower = 0;
        int upper = 0;
        for (int i = 0; i < nums.length; i++) {
            lower = Math.max(lower, nums[i]);
            upper += nums[i];
        }
        while (lower < upper) {
            // l=17 u=19 m=19
            // l=9 u=10 m=9
            int mid = lower + (upper - lower) / 2;
            if (check(nums, m, mid)) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        // 退出条件是 lower == upper == mid - 1 || mid + 1 || mid
        if (check(nums, m, lower)) {
            return lower;
        }
        if (check(nums, m, lower - 1)) {
            return lower - 1;
        }
        return lower + 1;
    }

    private boolean check(int[] nums, int m, int k) {
        int cuts = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > k) {
                cuts++;
                sum = num;
            }
        }
        return cuts < m;
    }
}
