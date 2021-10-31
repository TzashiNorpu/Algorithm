package algo.tzashinorpu.SecondRound.Chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class largestRectangleArea_084 {
    public int largestRectangleArea(int[] heights) {
        /*输入：heights = [2,1,5,6,2,3]
        输出：10*/
        int res = 0;
        int[] copy = new int[heights.length + 2];
        System.arraycopy(heights, 0, copy, 1, heights.length);
        copy[0] = -1;
        copy[copy.length - 1] = -1;
        System.out.println(Arrays.toString(copy));
        // stack 里是索引
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(0);
        // 递增stack
        for (int i = 1; i < copy.length; i++) {
            while (copy[i] < copy[stack.peek()]) {
                Integer popIndex = stack.pop();
                Integer leftIndex = stack.peek();
                res = Math.max((i - leftIndex - 1) * copy[popIndex], res);
            }
            stack.push(i);
        }
        return res;
    }
}
