package algo.tzashinorpu.Week01.Chapter04.Exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LeetCode_2_239_1 {
    public int[] maxSlidingWindow1(int[] nums, int k) {
        int length = nums.length;
        int[] res = new int[length -k+1];
        for (int left = 0; left <= length-k; left++) {
            int max = nums[left];
            for (int i = left; i <left+ k; i++) {
                max = Math.max(max,nums[i]);
            }
            res[left] = max;
        }
        return res;
    }

    public int[] maxSlidingWindow2(int[] nums, int k) {
        int[] res = new int[nums.length -k+1];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peekLast()] < nums[i]) {
                stack.pollLast();
            }
            stack.addLast(i);
            // 如果当前的最大值是 当前窗口之外的值[i-k] 则弹出
            if (stack.peek() <= i - k) {
                stack.pollFirst();
            }
            if (i +1>= k) {
                res[i-k+1]=nums[stack.peek()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {1,-1};
        LeetCode_2_239_1 sol = new LeetCode_2_239_1();
        int[] res = sol.maxSlidingWindow2(ints, 1);
        for (int e : res) {
            System.out.println(e);
        }
    }
}
