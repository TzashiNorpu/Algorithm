package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

import java.util.HashSet;

public class checkSubarraySum_523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] preSum = new int[len + 1];
        for (int i = 0; i < len; i++) preSum[i + 1] = preSum[i] + nums[i];
        // [1,2,3] -> [0,1,3,6]
        // preSum[j] - preSum[i-1] -> j=3,i=1 -> preSum[3]-preSum[0]=6 -> [i-1,j-1]
        // preSum[j]-preSum[i-1] == n*k -> preSum[j]/k-preSum[i-1]/k == n
        // 两者除 k 相减为整数，需要满足 sum[j] 和 sum[i - 1] 对 k 取余相同
        HashSet<Integer> set = new HashSet<>();
        // nums = [23, 2, 6, 7, 2], [0,23,25,31,38,40] %->[0,5,1,1,2,4] k = 6
        // 31%6->1时set里只有0,5,此时的25%6的1还没放进去
        for (int i = 2; i <= len; i++) {
            set.add(preSum[i - 2] % k);
            if (set.contains(preSum[i] % k)) return true;
        }
        return false;
    }
}
