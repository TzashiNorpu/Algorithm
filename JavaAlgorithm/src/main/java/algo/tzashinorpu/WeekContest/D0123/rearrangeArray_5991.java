package algo.tzashinorpu.WeekContest.D0123;

public class rearrangeArray_5991 {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res[posIndex] = nums[i];
                posIndex = posIndex + 2;
            }
            if (nums[i] < 0) {
                res[negIndex] = nums[i];
                negIndex = negIndex + 2;
            }
        }
        return res;
    }
}
