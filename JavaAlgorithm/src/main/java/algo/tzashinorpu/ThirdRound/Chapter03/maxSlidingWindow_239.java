package algo.tzashinorpu.ThirdRound.Chapter03;

import java.util.ArrayDeque;

public class maxSlidingWindow_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dequeue = new ArrayDeque<>();
        int len = nums.length;
        int[] res = new int[len - k + 1];
        for (int i = 0; i < len; i++) {
            while (!dequeue.isEmpty() && nums[i] > nums[dequeue.peekLast()]) {
                dequeue.pollLast();
            }
            dequeue.addLast(i);
            if (i - k >= dequeue.peekFirst()) {
                dequeue.pollFirst();
            }
            if (i - k + 1 >= 0) {
                res[i - k + 1] = nums[dequeue.peekFirst()];
            }
        }
        return res;
    }
}
