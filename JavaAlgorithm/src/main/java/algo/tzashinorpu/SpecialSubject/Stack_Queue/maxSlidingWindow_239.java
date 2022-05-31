package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.ArrayDeque;

public class maxSlidingWindow_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int len = nums.length;
        int[] res = new int[len - k + 1];
        for (int i = 0; i < len; i++) {
            // 单调递减
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) deque.pollLast();
            deque.offerLast(i);
            if (i - k >= deque.peekFirst()) {
                deque.pollFirst();
            }
            if (i - k + 1 >= 0) {
                res[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
