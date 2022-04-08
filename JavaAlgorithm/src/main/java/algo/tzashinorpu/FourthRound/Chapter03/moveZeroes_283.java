package algo.tzashinorpu.FourthRound.Chapter03;

public class moveZeroes_283 {
    public void moveZeroes(int[] nums) {
        // 1,1,0,3,12
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums[j] == 0) {
                nums[j++] = nums[i];
                nums[i] = 0;
            }
            if (nums[j] != 0)
                j++;
        }
    }
}
