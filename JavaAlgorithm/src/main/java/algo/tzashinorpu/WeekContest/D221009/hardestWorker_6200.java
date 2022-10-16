package algo.tzashinorpu.WeekContest.D221009;

public class hardestWorker_6200 {
    public int hardestWorker(int n, int[][] logs) {
        int t = logs[0][1], res = logs[0][0];
        for (int i = 1; i < logs.length; i++) {
            int time = logs[i][1] - logs[i - 1][1];
            if (time > t || (time == t && logs[i][0] < res)) {
                t = time;
                res = logs[i][0];
            }
        }
        return res;
    }
}
