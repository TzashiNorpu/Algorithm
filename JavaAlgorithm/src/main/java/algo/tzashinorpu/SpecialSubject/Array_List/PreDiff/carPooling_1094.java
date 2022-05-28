package algo.tzashinorpu.SpecialSubject.Array_List.PreDiff;

import java.util.HashMap;

public class carPooling_1094 {
    public boolean carPooling_1(int[][] trips, int capacity) {
        int[] loc = new int[1001];
        for (int[] trip : trips) {
            int v = trip[0];
            int l = trip[1];
            int r = trip[2];
            loc[l] += v;
            loc[r] -= v;
        }
        if (loc[0] > capacity) return false;
        for (int i = 1; i < 1001; i++) {
            loc[i] += loc[i - 1];
            if (loc[i] > capacity) return false;
        }
        return true;
    }

    public boolean carPooling_2(int[][] trips, int capacity) {
        // TreeMap按照添加的key值排序的  LinkedHashMap按照添加的顺序排序
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] trip : trips) {
            int start = trip[1];
            int end = trip[2];
            int v = trip[0];
            map.put(start, map.getOrDefault(start, 0) + v);
            map.put(end, map.getOrDefault(end, 0) - v);
        }
        for (int v : map.values()) {
            capacity -= v;
            if (capacity < 0) return false;
        }
        return true;
    }
}
