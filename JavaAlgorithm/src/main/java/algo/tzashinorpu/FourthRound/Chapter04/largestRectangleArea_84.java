package algo.tzashinorpu.FourthRound.Chapter04;

import java.util.Stack;

public class largestRectangleArea_84 {
    public int largestRectangleArea(int[] heights) {
        // 单调递增队列
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int len = heights.length + 1;
        int[] newH = new int[len];
        System.arraycopy(heights, 0, newH, 0, len - 1);
        newH[len - 1] = -1;
        stack.push(-1);
        for (int i = 0; i < len; i++) {
            while (stack.size() > 1 && newH[i] < newH[stack.peek()]) {
                Integer popIndex = stack.pop();
                Integer leftIndex = stack.peek();
                int area = (i - leftIndex - 1) * newH[popIndex];
                res = Math.max(res, area);
            }
            stack.push(i);
        }
        return res;
    }
}
