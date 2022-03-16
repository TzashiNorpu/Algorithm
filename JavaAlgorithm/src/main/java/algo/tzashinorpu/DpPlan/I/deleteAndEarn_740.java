package algo.tzashinorpu.DpPlan.I;

public class deleteAndEarn_740 {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
//        Arrays.stream(nums).max().getAsInt();
        int[] all = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            all[nums[i]]++;
        }
        int[] dp = new int[max + 1];
        dp[1] = all[1];
        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + i * all[i]);
        }
        return dp[max];
    }
}
