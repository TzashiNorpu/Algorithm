package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Stack;

public class trap_42 {
    public int trap(int[] height) {
        // 单调递减
        int res = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < height.length; i++) {
            while (stack.size() > 1 && height[stack.peekLast()] < height[i]) {
                int currIndex = stack.pollLast();
                int leftIndex = stack.peekLast();
                int rightIndex = i;
                int minH = Math.min(height[leftIndex], height[rightIndex]) - height[currIndex];
                res += (rightIndex - leftIndex - 1) * Math.max(minH, 0);
            }
            stack.offerLast(i);
        }
        return res;
    }
}
