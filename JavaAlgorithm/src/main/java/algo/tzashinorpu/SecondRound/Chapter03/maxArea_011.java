package algo.tzashinorpu.SecondRound.Chapter03;

public class maxArea_011 {
    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int h = height[i] < height[j] ? height[i++] : height[j--];
            res = Math.max(res, h * (j - i + 1));
        }
        return res;
    }
}
