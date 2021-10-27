package algo.tzashinorpu.FirstRound.Chapter04.Exercise;

import java.util.Stack;

public class LeetCode_2_084_1 {
    public int largestRectangleArea1(int[] heights) {
        int maxArea = 0;
        int len = heights.length;
        for (int i = 0; i < len; i++) {
            int left =i-1,right=i+1;
            int w =1;
            /*for (; (left>=0&&heights[left]>=heights[i] )||(right<len&&heights[right]>=heights[i]);) {
                if (left>=0&&heights[left]>=heights[i]){
                    left--;
                }
                if (right<len&&heights[right]>=heights[i]){
                    right++;
                }
            }
            maxArea = Math.max(maxArea, heights[i] * ((right - left - 1)));
            int area = heights[i]*((right-left-1));
            System.out.printf("index %d area = %d",i,area);
            System.out.println();
            */

            while (left>=0&&heights[left]>=heights[i]) {
                w++;
                left--;
            }
            while (right<len&&heights[right]>=heights[i]) {
                w++;
                right++;
            }
            maxArea = Math.max(maxArea, w * heights[i]);
   /*         System.out.printf("index %d area = %d",i,w * heights[i]);
            System.out.println();*/
        }
        return maxArea;
    }

    public int largestRectangleArea2(int[] heights) {
        // 求覆盖住当前柱子的最大面积即可，不覆盖住当前柱子的最大面积在比当前柱子高度小时已经计算
        // 如 2 1 5 6 2 3在计算后面那个2的最大面积时只用计算高度为2的面积即可
        // 高度为 1 的面积在柱子高度为 1 时的已经计算
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        stack.push(0);
        for (int i = 1; i < heights.length; i++) {
            while (stack.size()>1&&heights[i] < heights[stack.peek()]) {
                int left = stack.pop();
                Integer h = heights[left];
                maxArea= Math.max ((i - stack.peek()-1) * h,maxArea);
                System.out.printf("index %d area = %d",left,(i - stack.peek()-1) * h);
                System.out.println();
            }
            stack.push(i);
        }
        int right = heights.length;
        while ( stack.size() > 1) {
            int index = stack.pop();
            Integer h = heights[index];
            maxArea = Math.max(maxArea, h * (right - stack.peek()-1));
            System.out.printf("index %d area = %d",index,h * (right - stack.peek()-1));
            System.out.println();
        }
        return maxArea;
    }

    // 将 2 中的分段进行合并
    public int largestRectangleArea3(int[] heights) {
        int res = 0;
        int len = heights.length;
        int[] sentryH = new int[len+ 2];
        System.arraycopy(heights,0,sentryH,1,len);
        // 记录递增元素位置
        int[] stack = new int[len + 2];
        int pos = 1;
        for (int i = 1; i < len + 2; i++) {
            while (sentryH[i] < sentryH[stack[pos-1]]) {
                int leftIndex = stack[pos-2];
                int height = sentryH[stack[pos - 1]];
                int width = i - leftIndex - 1;
                int area = width * height;
                pos--;
                res = Math.max(res, area);
                /*System.out.printf("index %d area = %d",leftIndex,area);
                System.out.println();*/
            }
            stack[pos++] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode_2_084_1 sol = new LeetCode_2_084_1();
        int[] rec = {2,4};
        /*int max1 = sol.largestRectangleArea1(rec);
        System.out.println(max1);
        int max2 = sol.largestRectangleArea2(rec);
        System.out.println(max2);*/
        int max3 = sol.largestRectangleArea3(rec);
        System.out.println(max3);
    }
}
