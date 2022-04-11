package algo.tzashinorpu.FirstRound.Chapter04.Homework;

import java.util.Stack;

public class LeetCode_2_042 {
    // https://leetcode-cn.com/problems/trapping-rain-water/solution/
    // 接雨水
    /*
    暴力
     */
    public int trap1(int[] height) {
        int res = 0;
        int len = height.length;
        if (len <= 2) {
            return 0;
        }
        int[] indexTrap = new int[len - 2];
        for (int i = 1; i < len - 1; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int l = i, r = i; l >= 0 && r < len; ) {
                while (l >= 0) {
                    leftMax = Math.max(leftMax, height[l--]);
                }
                while (r < len) {
                    rightMax = Math.max(rightMax, height[r++]);
                }
            }
            indexTrap[i - 1] = Math.min(leftMax, rightMax) - height[i];
        }
        for (int i = 0; i < len - 2; i++) {
            res += indexTrap[i];
        }
        return res;
    }

    // trap1 中的做法是确定当前节点的左右的最大值，双指针法：从左往右遍历=》当左指针节点的leftMax小于右指针节点的rightMax时就可以确定左指针节点的储水量
    // leftMax 对 左指针节点 是确定的[因为左指针节点左侧的节点都已经遍历了]，rightMax 此时对 左指针节点 是不确定的[因为左指针节点右侧的节点未遍历完全]
    // 但是对 leftMax <= rightMax 情况左指针节点的储水量可以确定：不用确认左节点指针精确的 rightMax
    /*
    双指针
     */
    public int trap2(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length - 1;
        int leftMax = height[0];
        int rightMax = height[r];
        while (l < r) {
            if (leftMax <= rightMax) {
                res += leftMax - height[l];
                leftMax = Math.max(leftMax, height[++l]);
            } else {
                res += rightMax - height[r];
                rightMax = Math.max(rightMax, height[--r]);
            }
        }
        return res;
    }

    /*
    dynamic
     */
    public int trap3(int[] height) {
        int res = 0;
        int len = height.length;
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(height[i - 1], leftMax[i - 1]);
        }
        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i + 1], rightMax[i + 1]);
        }
        for (int i = 0; i < len; i++) {
            res += Math.max(Math.min(leftMax[i], rightMax[i]) - height[i], 0);
        }
        return res;
    }


    /*
   stack
    */
    public int trap4(int[] height) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.empty() && height[i] > height[stack.peek()]) {
                /*int currIndex = stack.pop();
                if (stack.empty()) break;
                int leftIndex = stack.peek();
                int rightIndex = i;
                int currH = height[currIndex];
                int leftH = height[leftIndex];
                int rightH = height[rightIndex];
                int area = (Math.min(leftH,rightH) - currH)*(rightIndex-leftIndex-1);
                res += area;
                System.out.printf("Index %d area = %d",currIndex,area);
                System.out.println();*/
                // --->
                int currIndex = stack.pop();
                if (stack.empty()) break;
                int leftIndex = stack.peek();
                res += (Math.min(height[leftIndex], height[i]) - height[currIndex]) * (i - leftIndex - 1);
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] trap = {0, 1, 0, 2, 3, 1, 1, 3, 2, 1, 2, 1};
        LeetCode_2_042 sol = new LeetCode_2_042();
        System.out.println(sol.trap4(trap));
    }
}
