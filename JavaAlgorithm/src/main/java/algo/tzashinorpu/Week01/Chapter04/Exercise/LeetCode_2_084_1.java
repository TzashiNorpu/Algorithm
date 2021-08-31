package algo.tzashinorpu.Week01.Chapter04.Exercise;

import java.util.Stack;

public class LeetCode_2_084_1 {
    public int largestRectangleArea1(int[] heights) {
        int maxArea = 0;
        int len = heights.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                int minHij = heights[j];
                for (int k = j; k <= i; k++) {
                    minHij = Math.min(minHij, heights[k]);
                }
//                int areaij = (i-j+1)*minHij;
                maxArea = Math.max((i - j + 1) * minHij, maxArea);
//                System.out.printf("%d to %d area:%d",i,j,areaij);
//                System.out.println();
            }
        }
        return maxArea;
    }

    public int largestRectangleArea2(int[] heights) {
        // 求覆盖住当前柱子的最大面积即可，不覆盖住当前柱子的最大面积在比当前柱子高度小时已经计算
        // 如 2 1 5 6 2 3在计算后面那个2的最大面积时只用计算高度为2的面积即可
        // 高度为 1 的面积在柱子高度为 1 时的已经计算
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(0);
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < heights[stack.peek()]) {
                Integer pop = stack.pop();
                maxArea = Math.max (pop-stack.peek() * heights[pop],maxArea);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        LeetCode_2_084_1 sol = new LeetCode_2_084_1();
        int[] rec = {2,1,5,6,2,3};
        int max = sol.largestRectangleArea2(rec);
        System.out.println(max);
    }
}
