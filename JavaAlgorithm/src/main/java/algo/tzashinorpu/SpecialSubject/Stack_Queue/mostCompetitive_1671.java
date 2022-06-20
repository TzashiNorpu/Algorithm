package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class mostCompetitive_1671 {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] res = new int[k];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.empty() && nums[i] < nums[stack.peek()] && nums.length - i + stack.size() > k) stack.pop();
            if (stack.size() < k) stack.push(i);
        }
        for (int i = k - 1; i >= 0; i--) {
            res[i] = nums[stack.pop()];
        }
        return res;

        /*int stack[] = new int[k], n = nums.length, j = 0;
        for (int i = 0; i < n; ++i) {
            while (j > 0 && stack[j - 1] > nums[i] && j - 1 + n - i >= k)
                j--;
            if (j < k)
                stack[j++] = nums[i];
        }
        return stack;*/
    }
}
