package algo.tzashinorpu.SecondRound.Chapter04;

import java.util.LinkedList;

public class maxSlidingWindow_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /*输入：nums = [4,3,-1,-3,5,3,6,7], k = 3
        输出：[4,3,5,5,6,7]*/
        int[] res = new int[nums.length - k + 1];
        // 递减索引队列
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (queue.size() > 0 && nums[i] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.offerLast(i);
            if (i - queue.peekFirst() == k) {
                queue.pollFirst();
            }
            if (i >= k - 1) {
                res[i + 1 - k] = nums[queue.peekFirst()];
            }
        }
        return res;
    }
}
