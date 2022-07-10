package algo.tzashinorpu.WeekContest.D220709;

import java.util.Arrays;

public class latestTimeCatchTheBus_6117 {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(passengers);
        Arrays.sort(buses);
        int i = 0, count = 0;
        for (var t : buses) {
            for (count = capacity; count > 0 && i < passengers.length && passengers[i] < t; i++) count--;
        }
        i--;
        var ans = count > 0 ? buses[buses.length - 1] : passengers[i];
        while (i >= 0 && passengers[i--] == ans) --ans;
        return ans;
    }
}
