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
        int length = nums.length;
        int[] res = new int[length -k+1];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty()) {
                stack.push(nums[i]);
            }else {

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {1,3,2,-3,2,3,6,7};
        LeetCode_2_239_1 sol = new LeetCode_2_239_1();
        int[] res = sol.maxSlidingWindow2(ints, 3);
        for (int e : res) {
            System.out.println(e);
        }
    }
}
