package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Stack;

public class nextGreaterElements_503 {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Stack<Integer> stack = new Stack<>();
        // 1,2,1,1,2,1 -> 2,-1,2
        for (int i = len * 2 - 1; i >= 0; i--) {
            // top->bottom 递增
            int num = nums[i % len];
            while (!stack.empty() && num >= stack.peek()) stack.pop();
            res[i % len] = stack.empty() ? -1 : stack.peek();
            stack.push(num);
        }
        return res;
    }
}
