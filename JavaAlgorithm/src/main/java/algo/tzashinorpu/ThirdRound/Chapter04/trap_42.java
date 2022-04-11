package algo.tzashinorpu.ThirdRound.Chapter04;

import java.util.Stack;

public class trap_42 {
    public int trap(int[] height) {
        int sum = 0;
        // 递减队列
        // 0,1,0,2,1,0,1,3,2,1,2,1
        /*Stack<Integer> stack = new Stack<>();

        int len = height.length;
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                Integer popIndex = stack.pop();
                if (stack.empty()) break;
                int h = Math.min(height[stack.peek()], height[i]) - height[popIndex];
                sum += (i - stack.peek() - 1) * h;
            }
            stack.push(i);
        }
        */
        // 左右最大值中的较小值和当前高度决定了当前位置的蓄水量
        int l = 0;
        int r = height.length - 1;
        int lMax = height[l];
        int rMax = height[r];
        for (; l < r; ) {
            if (lMax < rMax) {
                sum += lMax - height[l];
                lMax = Math.max(lMax, height[++l]);
            } else {
                sum += rMax - height[r];
                rMax = Math.max(rMax, height[--r]);
            }
        }
        return sum;
    }
}
