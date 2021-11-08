package algo.tzashinorpu.FirstRound.Chapter10;

public class LeetCode_3_055_1 {
    public boolean canJump1(int[] nums) {
        //如果一个位置能够到达，那么这个位置左侧所有位置都能到达
        int rightMost = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > rightMost) {
                return false;
            }
            rightMost = Math.max(rightMost, i + nums[i]);
            if (rightMost >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }

    public boolean canJump2(int[] nums) {
        int end = 0;
        int rightMost = 0;
        for (int i = 0; i < nums.length; i++) {
            rightMost = Math.max(rightMost, i + nums[i]);
            if (i > end) {
                return false;
            }
            if (i == end) {
                end = rightMost;
                if (end >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
