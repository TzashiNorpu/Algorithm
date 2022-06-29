package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.ArrayDeque;

public class largestRectangleArea_84 {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        // 单调递增
        int n = heights.length;
        int[] h = new int[n + 1];
        h[n] = -1;
        System.arraycopy(heights, 0, h, 0, n);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && h[stack.peekLast()] > h[i]) {
                Integer popIndex = stack.pollLast();
                int leftIndex = stack.isEmpty() ? -1 : stack.peekLast();
                int rightIndex = i;
                max = Math.max(max, h[popIndex] * (rightIndex - leftIndex - 1));
            }
            stack.offerLast(i);
        }
        return max;
    }
}
