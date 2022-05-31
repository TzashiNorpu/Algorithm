package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

import java.util.Arrays;

public class minEatingSpeed_875 {
    public int minEatingSpeed_1(int[] piles, int h) {
        Arrays.sort(piles);
        int l = 1, r = piles[piles.length - 1];
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int hours = hoursOfK(mid, piles);
            // mid 大了  r 右侧的值使得时间 <=h
            if (hours <= h) {
                r = mid - 1;
            } else {
                // mid 小了   l左侧的值使得时间 >h
                l = mid + 1;
            }

        }
        return l;
    }

    private int hoursOfK(int mid, int[] piles) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            if (mid >= piles[i]) {
                hours++;
            } else {
                hours += piles[i] % mid == 0 ? piles[i] / mid : piles[i] / mid + 1;
            }
        }
        return hours;
    }

    public int minEatingSpeed_2(int[] piles, int h) {
        int l = 1, r = 1000000000;
        while (l < r) {
            int m = (l + r) / 2, total = 0;
            for (int p : piles)
                total += (p + m - 1) / m;
            if (total > h)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }
}
