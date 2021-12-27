package algo.tzashinorpu.WeekContest.D1226;

import java.util.HashMap;

public class E5965 {
    public long[] getDistances(int[] arr) {
        int length = arr.length;
        long[] res = new long[length];
        long[] re1 = new long[length];
        // 上次的位置和目前位置出现的次数
        HashMap<Integer, int[]> m1 = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int v = arr[i];
            int[] orDefault = m1.getOrDefault(v, new int[2]);
            if (orDefault[1] != 0) {
                re1[i] += re1[orDefault[0]] + (i - orDefault[0]) * orDefault[1];
            }
            orDefault[0] = i;
            orDefault[1]++;
            m1.put(v, orDefault);
        }
        long[] re2 = new long[length];
        HashMap<Integer, int[]> m2 = new HashMap<>();
        for (int i = length - 1; i >= 0; i--) {
            int v = arr[i];
            int[] orDefault = m2.getOrDefault(v, new int[2]);
            if (orDefault[1] != 0) {
                re2[i] += re2[orDefault[0]] + (orDefault[0] - i) * orDefault[1];
            }
            orDefault[0] = i;
            orDefault[1]++;
            m2.put(v, orDefault);
        }
        for (int i = 0; i < length; i++) {
            res[i] = re1[i] + re2[i];
        }
        return res;
    }
}
