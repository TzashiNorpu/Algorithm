package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import java.util.Arrays;

public class LeetCode_5_213 {
    public int rob(int[] nums) {
        /*如何才能保证第一间房屋和最后一间房屋不同时偷窃呢？
        如果偷窃了第一间房屋，则不能偷窃最后一间房屋，因此偷窃房屋的范围是第一间房屋到最后第二间房屋；
        如果偷窃了最后一间房屋，则不能偷窃第一间房屋，因此偷窃房屋的范围是第二间房屋到最后一间房屋。*/
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] ints1 = Arrays.copyOfRange(nums, 1, nums.length);
        int[] ints2 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        return Math.max(robByBottomUp(ints1), robByBottomUp(ints2));
    }

    private int robByBottomUp(int[] nums) {
        // [2,1,1,2]
        int pre = 0, cur = 0, tmp;
        for (int num : nums) {
            tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }
}
