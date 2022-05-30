package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

public class trap_42 {
    public int trap(int[] height) {
        // [5,5,1,7,1,1,5,2,7,6]
        int res = 0;
        int len = height.length;
        for (int i = 0, j = len - 1, lMax = height[i], rMax = height[j]; i <= j; ) {
            if (lMax < rMax) {
                lMax = Math.max(lMax, height[i]);
                res += (lMax - height[i++]);
            } else {
                rMax = Math.max(rMax, height[j]);
                res += (rMax - height[j--]);
            }
        }
        return res;
    }
}
