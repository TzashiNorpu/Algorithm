package algo.tzashinorpu.DpPlan.I;

public class rob_213 {
    // 2,1,1,2
    //    房屋数量不超过两间时，最多只能偷窃一间房屋，因此不需要考虑首尾相连的问题。如果房屋数量大于两间，就必须考虑首尾相连的问题，第一间房屋和最后一间房屋不能同时偷窃.
    //    如何才能保证第一间房屋和最后一间房屋不同时偷窃呢？
    //    如果偷窃了第一间房屋，则不能偷窃最后一间房屋，因此偷窃房屋的范围是第一间房屋到最后第二间房屋；
    //    如果偷窃了最后一间房屋，则不能偷窃第一间房屋，因此偷窃房屋的范围是第二间房屋到最后一间房屋。

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] first = new int[nums.length - 1];
        int[] last = new int[nums.length - 1];
        System.arraycopy(nums, 0, first, 0, nums.length - 1);
        System.arraycopy(nums, 1, last, 0, nums.length - 1);
        return Math.max(rob1(first), rob1(last));
    }

    private int rob1(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length + 1];
        dp[1] = nums[0];
        for (int i = 2; i <= length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[length];
    }
}
