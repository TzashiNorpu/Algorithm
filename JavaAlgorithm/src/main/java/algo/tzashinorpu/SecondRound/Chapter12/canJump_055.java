package algo.tzashinorpu.SecondRound.Chapter12;

public class canJump_055 {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        int dest = length - 1;
        for (int i = length - 2; i >= 0; i--) {
            if (i + nums[i] >= dest) {
                dest = i;
            }
        }
        return dest == 0;
    }
}
