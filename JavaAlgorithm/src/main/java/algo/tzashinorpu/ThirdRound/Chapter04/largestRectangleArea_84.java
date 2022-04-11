package algo.tzashinorpu.ThirdRound.Chapter04;

import java.util.Stack;

public class largestRectangleArea_84 {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        int len = heights.length;
        int[] nums = new int[len + 2];
        System.arraycopy(heights, 0, nums, 1, len);
        nums[0] = -1;
        nums[len + 1] = -1;
        stack.push(0);
        for (int i = 1; i < len + 2; i++) {
            while (stack.size() > 1 && nums[i] < nums[stack.peek()]) {
                Integer popIndex = stack.pop();
                Integer leftIndex = stack.peek();
                int area = (i - leftIndex - 1) * nums[popIndex];
                max = Math.max(max, area);
            }
            stack.push(i);
        }
        return max;
    }
}
