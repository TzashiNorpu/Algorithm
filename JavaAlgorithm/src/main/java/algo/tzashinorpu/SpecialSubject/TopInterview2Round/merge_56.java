package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.Arrays;

public class merge_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] res = new int[intervals.length][2];
        int idx = -1;

        for (var t : intervals) {
            if (idx == -1 || t[0] > res[idx][1]) res[++idx] = t;
            else res[idx][1] = Math.max(res[idx][1], t[1]);
        }
        return Arrays.copyOf(res, idx + 1);
    }
}
