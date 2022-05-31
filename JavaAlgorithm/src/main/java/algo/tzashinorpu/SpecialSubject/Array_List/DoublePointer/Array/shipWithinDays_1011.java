package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

public class shipWithinDays_1011 {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }
        while (l <= r) {
            int mid = l + (r - l) / 2, cur = 0, need = 1;
            for (int w : weights) {
                if (cur + w > mid) {
                    need += 1;
                    cur = 0;
                }
                cur += w;
            }
            // mid 偏小 l左侧 > days
            if (need > days) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}
