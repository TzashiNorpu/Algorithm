package algo.tzashinorpu.SpecialSubject.Top;

public class trap_42 {
    public int trap(int[] height) {
        int res = 0;
        int len = height.length;
      /*  int lMax = height[0];
        int rMax = height[len - 1];*/
        for (int l = 0, r = len - 1, lMax = height[0], rMax = height[len - 1]; l < r; ) {
            if (lMax < rMax) {
                res += lMax - height[l];
                lMax = Math.max(lMax, height[++l]);
            } else {
                res += rMax - height[r];
                rMax = Math.max(rMax, height[--r]);
            }
        }
        return res;
    }
}
