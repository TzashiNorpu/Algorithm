package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

public class NumArray_303 {
    int[] preSum;

    public NumArray_303(int[] nums) {
        int len = nums.length;
        preSum = new int[len];
        // 1,2,3 -> 1,3,6
        for (int i = 0; i < len; i++) {
            preSum[i] = (i > 0 ? preSum[i - 1] : 0) + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return preSum[right] - (left > 0 ? preSum[left - 1] : 0);
    }
}
