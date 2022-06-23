package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class maxArea_11 {
    public int maxArea(int[] height) {
        int res = 0;
        for (int l = 0, r = height.length - 1; l < r; ) {
            int h = height[l] < height[r] ? height[l++] : height[r--];
            res = Math.max(res, (r - l + 1) * h);
        }
        return res;
    }
}
