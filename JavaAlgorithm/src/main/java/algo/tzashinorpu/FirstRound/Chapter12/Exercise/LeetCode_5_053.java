package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_053 {
    // 暴力1：穷尽所有子序列  三重循环
    public int maxSubArray1(int[] nums) {
        int length = nums.length;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int temp = 0;
                for (int k = i; k <= j; k++) {
                    temp += nums[k];
                }
                res = Math.max(res, temp);
            }
        }
        return res;
    }

    // 暴力2：穷尽所有子序列  两重循环
    public int maxSubArray2(int[] nums) {
        int length = nums.length;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            int temp = 0;
            for (int j = i; j < length; j++) {
                temp += nums[j];
                res = Math.max(res, temp);
            }
        }
        return res;
    }

    // dp
    // dp[i] i位置处最大的序列和
    // dp[i] = max(dp[i-1]+nums[i],nums[i]):dp[i-1] < 0 时dp[i] = nums[i],dp[i-1]>0 时 dp[i] = dp[i-1]+nums[i]
    public int maxSubArrayDP(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < length; i++) {
//            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            dp[i] = dp[i - 1] <= 0 ? nums[i] : dp[i - 1] + nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    // 贪心
    public int maxSubArrayGreedy(int[] nums) {
        // [-2, 1, -3, 4, -1, 2, 1, -5, 4] -> 6
        // [-2,-1,-3] -> -1
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }

    // divide
    public int maxSubArrayDivide(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        Status s = dfs(nums, l, r);
        return s.subMax;
    }

    private Status dfs(int[] nums, int l, int r) {
        if (l == r) {
            return new Status(nums[l], nums[l], nums[l], nums[l]);
        }
        int mid = (l + r) / 2;
        Status left = dfs(nums, l, mid);
        Status right = dfs(nums, mid + 1, r);
        return merge(left, right);
    }

    private Status merge(Status left, Status right) {
        // [1,-2,1] ->
        Status s = new Status();
        s.lSubMax = Math.max(left.lSubMax, left.sum + right.lSubMax);
        s.rSubMax = Math.max(right.rSubMax, right.sum + left.rSubMax);
        s.subMax = Math.max(left.rSubMax + right.lSubMax, Math.max(left.subMax, right.subMax));
        s.sum = left.sum + right.sum;
        return s;
    }

    class Status {
        private int lSubMax, rSubMax, subMax, sum;

        public Status() {
        }

        public Status(int lMax, int rMax, int mMax, int sum) {
            this.lSubMax = lMax;
            this.rSubMax = rMax;
            this.subMax = mMax;
            this.sum = sum;
        }
    }
}
