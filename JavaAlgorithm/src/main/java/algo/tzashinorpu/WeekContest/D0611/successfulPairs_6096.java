package algo.tzashinorpu.WeekContest.D0611;

import java.util.Arrays;

public class successfulPairs_6096 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int len1 = spells.length;
        int len2 = potions.length;
        int[] res = new int[len1];
        for (int i = 0; i < len2; i++) {
            potions[i] = (int) (Math.ceil(success * 1.0 / potions[i]));
        }
        Arrays.sort(potions);
        int l = 0, r = len2 - 1;
        for (int i = 0; i < len1; i++) {
            // 左侧 <= num
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (potions[mid] <= spells[i]) l = mid + 1;
                else r = mid - 1;
            }
            res[i] = l;
            l = 0;
            r = len2 - 1;
        }

        return res;

    }
}
