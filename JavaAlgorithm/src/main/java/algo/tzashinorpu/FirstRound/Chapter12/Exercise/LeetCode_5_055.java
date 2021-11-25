package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_055 {
    public boolean canJump1(int[] nums) {
        int end = nums.length - 1;
        for (int i = end; i >= 0; i--) {
            if (i + nums[i] >= end) {
                end = i;
            }
        }
        return end == 0;
    }

    public boolean canJump2(int[] nums) {
        int end = nums.length - 1;
        for (int i = 0; i < end; i++) {
            if (i + nums[i] >= end) {
                return true;
            }
        }
        return false;
    }
}
