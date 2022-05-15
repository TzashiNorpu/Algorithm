package algo.tzashinorpu.GSSY.DoublePoint;

public class removeDuplicates_26 {
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 0;
        for (; r < nums.length; r++) {
            if (nums[l] != nums[r]) {
                nums[++l] = nums[r];
            }
        }
        return l + 1;
    }
}
