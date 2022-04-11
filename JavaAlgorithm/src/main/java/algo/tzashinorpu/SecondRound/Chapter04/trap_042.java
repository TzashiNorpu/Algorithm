package algo.tzashinorpu.SecondRound.Chapter04;

import java.util.LinkedList;

public class trap_042 {
    public int trap1(int[] height) {
        int res = 0;
        /*输入：height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
        输出：6*/
        // 递减索引队列
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < height.length; i++) {
            while (queue.size() > 1 && height[i] > height[queue.peekLast()]) {
                Integer popIndex = queue.pollLast();
                Integer leftIndex = queue.peekLast();
                int h = Math.min(height[leftIndex], height[i]) - height[popIndex];
                res += (i - leftIndex - 1) * (Math.max(h, 0));
            }
            queue.offerLast(i);
        }
        return res;
    }

    public int trap2(int[] height) {
        int res = 0;
        int lMax = height[0];
        int rMax = height[height.length - 1];
        for (int i = 0, j = height.length - 1; i < j; ) {
            if (lMax <= rMax) {
                res += (lMax - height[i]);
                lMax = Math.max(lMax, height[++i]);
            } else {
                res += (rMax - height[j]);
                rMax = Math.max(rMax, height[--j]);
            }
        }
        return res;
    }
}
