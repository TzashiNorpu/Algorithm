package algo.tzashinorpu.SecondRound.Chapter12;

public class rob_198 {
    public int robDp(int[] nums) {
        // dp[i] = max(dp[i-2]+nums[i],dp[i-1])
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }

    public int robBottomUp(int[] nums) {
        // dp[i] = max(dp[i-2]+nums[i],dp[i-1])
        // 1,2,2,2,1 ->  0,  0,    1,    2,   2,2,1
        //            prev  curr  num
        //                  prev  curr  num
        int prev = 0, curr = 0, temp = 0;
        for (int num : nums) {
            temp = curr;
            curr = Math.max(prev + num, curr);
            prev = temp;
        }
        return curr;
    }
}

