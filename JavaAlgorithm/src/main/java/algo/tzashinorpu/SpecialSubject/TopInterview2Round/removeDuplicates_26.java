package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class removeDuplicates_26 {
    public int removeDuplicates(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != pos && nums[i] != nums[pos]) nums[++pos] = nums[i];
        }
        return pos + 1;
    }
}
