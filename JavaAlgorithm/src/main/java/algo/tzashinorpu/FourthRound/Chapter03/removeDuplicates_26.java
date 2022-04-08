package algo.tzashinorpu.FourthRound.Chapter03;

public class removeDuplicates_26 {
    public int removeDuplicates(int[] nums) {
        // 0,0,1,1,1,2,2,3,3,4 -> 0,1,2,3,4,_,_,_,_,_
        // 1,1,2 ->
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}
