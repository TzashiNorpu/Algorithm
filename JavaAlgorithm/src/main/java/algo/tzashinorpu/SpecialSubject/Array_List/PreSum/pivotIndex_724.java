package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

public class pivotIndex_724 {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] preSum = new int[len + 1];
        for (int i = 0; i < len; i++) preSum[i + 1] = preSum[i] + nums[i];
        for (int i = 0; i < len; i++) {
            // [1,2,3] -> [0,1,3,6]  preSum[i] ->[0,i-1]
            // preSum[j] - preSum[i] -> j=3,i=1 -> preSum[3]-preSum[1]=5 -> [i,j-1]
            if (preSum[i] == preSum[len] - preSum[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
