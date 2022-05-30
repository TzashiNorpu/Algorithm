package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

public class removeDuplicates_26 {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        for (int r = l; r < nums.length; r++) {
            if (l != r && nums[r] != nums[l]) {
                nums[++l] = nums[r];
            }
        }
        return l;
    }
}
