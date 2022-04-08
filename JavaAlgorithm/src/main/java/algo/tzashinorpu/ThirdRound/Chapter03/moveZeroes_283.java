package algo.tzashinorpu.ThirdRound.Chapter03;

public class moveZeroes_283 {
    public void moveZeroes(int[] nums) {
        // 0,1,0,3,12 -> 1,3,12,0,0
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[pos];
            if (nums[i] != 0) {
                nums[pos++] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
