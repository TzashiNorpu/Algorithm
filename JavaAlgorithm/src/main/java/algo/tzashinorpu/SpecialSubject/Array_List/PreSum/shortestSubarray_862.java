package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

import java.util.ArrayDeque;
import java.util.HashMap;

public class shortestSubarray_862 {
    public int shortestSubarray(int[] nums, int k) {
        int len = nums.length;
        long[] preSum = new long[len + 1];
        for (int i = 0; i < len; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int ans = len + 1;
        /*for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                // [2,-1,2]->[0,2,1,3]
                // [2,4,2]->[0,2,6,8]
                if (preSum[j] - preSum[i] >= k) ans = Math.min(ans, j - i);
            }
        }*/
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < len + 1; i++) {
            while (deque.size() > 0 && preSum[i] - preSum[deque.getFirst()] >= k)
                ans = Math.min(ans, i - deque.pollFirst());
            // 单调递增队列
            while (deque.size() > 0 && preSum[i] <= preSum[deque.getLast()]) deque.pollLast();
            deque.addLast(i);
        }
        return ans <= len ? ans : -1;
    }
}
