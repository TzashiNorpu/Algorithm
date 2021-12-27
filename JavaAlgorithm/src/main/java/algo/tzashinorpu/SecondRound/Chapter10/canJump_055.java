package algo.tzashinorpu.SecondRound.Chapter10;

public class canJump_055 {
    public boolean canJump1(int[] nums) {
        int length = nums.length;
        int des = length - 1;
        for (int i = length - 2; i >= 0; i--) {
            if (i + nums[i] >= des) {
                des = i;
            }
        }
        return des == 0;
    }

    // greedy
    public boolean canJump2(int[] nums) {
        int length = nums.length;
        int rightMost = 0;
        for (int i = 0; i < length; i++) {
            // 能到的位置大于等于当前索引位置
            if (i <= rightMost) {
                rightMost = Math.max(rightMost, i + nums[i]);
                // 能到的位置大于等于最后的位置
                if (rightMost >= length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
