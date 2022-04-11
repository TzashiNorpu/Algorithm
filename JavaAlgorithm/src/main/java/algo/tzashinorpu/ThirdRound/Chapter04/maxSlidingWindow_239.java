package algo.tzashinorpu.ThirdRound.Chapter04;

import java.util.ArrayDeque;

public class maxSlidingWindow_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 3,1,1,1,1
        int len = nums.length;
        int[] res = new int[len - k + 1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i - deque.peekFirst() >= k) {
                deque.pollFirst();
            }
            if (i - k + 1 >= 0) {
                res[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
