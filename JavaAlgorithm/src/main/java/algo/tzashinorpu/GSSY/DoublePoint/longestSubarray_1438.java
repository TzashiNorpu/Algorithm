package algo.tzashinorpu.GSSY.DoublePoint;

import java.util.ArrayDeque;

public class longestSubarray_1438 {
    public int longestSubarray(int[] nums, int limit) {
        int maxLen = 0;
        ArrayDeque<Integer> max = new ArrayDeque<>();
        ArrayDeque<Integer> min = new ArrayDeque<>();
        for (int l = 0, r = 0; r < nums.length; r++) {
            // = 是为了走得更远 [8,8]
            while (!max.isEmpty() && nums[r] >= nums[max.peekLast()]) max.pollLast();
            max.offerLast(r);
            while (!min.isEmpty() && nums[r] <= nums[min.peekLast()]) min.pollLast();
            min.offerLast(r);
            // 移除失效的 最大最小值  滑动窗口
            // [4,8,2,1]  limit=5
            while (Math.abs(nums[max.peekFirst()] - nums[min.peekFirst()]) > limit) {
                l++;
                if (max.peekFirst() < l) max.pollFirst();
                if (min.peekFirst() < l) min.pollFirst();
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
