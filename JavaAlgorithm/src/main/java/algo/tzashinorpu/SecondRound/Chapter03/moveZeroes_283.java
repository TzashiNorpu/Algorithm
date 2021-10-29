package algo.tzashinorpu.SecondRound.Chapter03;

public class moveZeroes_283 {
    public void moveZeroes(int[] nums) {
        /*输入: [0,1,0,3,12]
        输出: [1,3,12,0,0]*/
        for (int i = 0, index = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
                if (index - 1 != i) {
                    nums[i] = 0;
                }
            }
        }
    }
}
