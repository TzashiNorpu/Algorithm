package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

import java.util.Arrays;

public class minEatingSpeed_875 {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l = piles[0], r = piles[piles.length - 1];
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int hours = hoursOfK(mid, piles);
            if (hours < h) {
                l = mid + 1;
            } else if (hours > h) {
                r = mid - 1;
            }

        }
        return 0;
    }

    private int hoursOfK(int mid, int[] piles) {
        return 0;
    }
}
