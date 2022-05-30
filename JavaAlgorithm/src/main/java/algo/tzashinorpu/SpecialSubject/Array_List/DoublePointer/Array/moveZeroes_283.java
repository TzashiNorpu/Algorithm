package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

public class moveZeroes_283 {
    //    Input: nums = [0,1,0,3,12]
    //    Output: [1,3,12,0,0]
    public void moveZeroes(int[] nums) {
        for (int i = 0, p = 0; i < nums.length; i++) {
            if (nums[p] == 0 && nums[i] != 0) {
                nums[p++] = nums[i];
                nums[i] = 0;
            }
            if (nums[p] != 0) p++;
        }
    }
}
