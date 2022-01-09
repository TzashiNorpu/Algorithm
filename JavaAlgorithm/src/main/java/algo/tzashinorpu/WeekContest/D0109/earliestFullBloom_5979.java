package algo.tzashinorpu.WeekContest.D0109;

public class earliestFullBloom_5979 {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        int days = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            days += plantTime[i];
            min1 = Math.min(min1, growTime[i]);
            min2 = Math.min(min2, plantTime[i]);
        }
        return days + min1 > min2 ? min1 - 1 : min2;
    }
}
