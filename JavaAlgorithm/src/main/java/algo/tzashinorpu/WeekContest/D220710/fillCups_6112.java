package algo.tzashinorpu.WeekContest.D220710;

import java.util.Arrays;

public class fillCups_6112 {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int res = 0;
        while (amount[1] != 0) {
            Arrays.sort(amount);
            amount[2]--;
            amount[1]--;
            res++;
        }
        Arrays.sort(amount);
        return res + amount[2];
    }
}
