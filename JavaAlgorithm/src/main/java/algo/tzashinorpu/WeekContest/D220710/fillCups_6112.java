package algo.tzashinorpu.WeekContest.D220710;

import java.util.Arrays;

public class fillCups_6112 {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if (amount[0] == 0) return amount[2];
        int sum = Arrays.stream(amount).sum() / 2;
        if (sum % 2 != 0) return sum / 2 + 1;
        return sum / 2;
    }
}
