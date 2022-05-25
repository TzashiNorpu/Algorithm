package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

public class subarraySum_560 {

    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] preSum = new int[len + 1];
        for (int i = 1; i <= len; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
        int res = 0;
        // 1,2,3   3
        // -1,-1,1  0
        for (int i = 0, j = 1; j <= len; ) {
            
        }
        return res;
    }
}
