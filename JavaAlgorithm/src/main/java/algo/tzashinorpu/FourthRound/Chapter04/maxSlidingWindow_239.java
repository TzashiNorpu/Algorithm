package algo.tzashinorpu.FourthRound.Chapter04;

import java.util.ArrayDeque;

public class maxSlidingWindow_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 3,1,2,-3,5,3,6,7  3
        // 3,1,5,5,6,7
        int length = nums.length;
        int[] res = new int[length - k + 1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            if (i - k >= deque.peekFirst()) {
                deque.pollFirst();
            }
            if (i - k + 1 >= 0) {
                res[i - k + 1] = deque.peekFirst();
            }
        }
        return res;
    }
}
