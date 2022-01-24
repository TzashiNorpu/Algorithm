package algo.tzashinorpu.WeekContest.D0122;

import java.util.Arrays;

public class minimumCost_5971 {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            res += ((cost.length - 1 - i) % 3 != 2 ? cost[i] : 0);
        }
        return res;
    }
}
