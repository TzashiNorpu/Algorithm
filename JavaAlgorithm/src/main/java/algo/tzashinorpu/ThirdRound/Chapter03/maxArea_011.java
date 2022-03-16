package algo.tzashinorpu.ThirdRound.Chapter03;

public class maxArea_011 {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int h = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, h * ((j - i) + 1));
        }
        return max;
    }
}
