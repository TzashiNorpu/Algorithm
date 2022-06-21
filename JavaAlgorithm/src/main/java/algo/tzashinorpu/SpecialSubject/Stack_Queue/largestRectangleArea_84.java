package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class largestRectangleArea_84 {
    public int largestRectangleArea(int[] heights) {
        // 递增
        int max = 0;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.push(-1);
        int n = heights.length;
        int[] nums = new int[n + 1];
        System.arraycopy(heights, 0, nums, 0, n);
        nums[n] = -1;
        for (int i = 0; i <= n; i++) {
            while (deque.size() > 1 && nums[i] < nums[deque.peekLast()]) {
                int rightIndex = i;
                int currIndex = deque.pollLast();
                int leftIndex = deque.peekLast();
                max = Math.max(max, (rightIndex - leftIndex - 1) * nums[currIndex]);
            }
            deque.offerLast(i);
        }
        return max;
    }
}
