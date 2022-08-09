package algo.tzashinorpu.WeekContest.D220731;

public class maximumGroups_6133 {
    public int maximumGroups(int[] grades) {
        int n = grades.length;
        int tmp = n;
        for (int i = 1; i <= n; i++) {
            tmp -= i;
            if (tmp < 0) return i - 1;
            if (tmp == 0) return i;
        }
        return 1;
    }


}
