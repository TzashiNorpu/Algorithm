package algo.tzashinorpu.Week01.Chapter04.Exercise;

import java.util.HashMap;
import java.util.Stack;

public class LeetCode_2_084 {
    // https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
    // 柱状图中矩形的最大面积
    private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> idxArea = new HashMap<Integer, Integer>();
        stack.push(-1);
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
                Integer curIdx = stack.pop();
                int area = heights[curIdx] * (i - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
                idxArea.put(curIdx, area);
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            Integer curIdx = stack.pop();
            int area = heights[curIdx] * (heights.length - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
            idxArea.put(curIdx, area);
        }
        idxArea.forEach((k, v) -> {
            System.out.println("Index:" + k + ",Area:" + v);
        });
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {6, 7, 5, 2, 4, 5, 9, 3};
        LeetCode_2_084 test = new LeetCode_2_084();
        System.out.println(test.largestRectangleArea(heights));
    }
}
