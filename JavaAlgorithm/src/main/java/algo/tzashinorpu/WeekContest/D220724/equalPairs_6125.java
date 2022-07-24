package algo.tzashinorpu.WeekContest.D220724;

import java.util.HashMap;
import java.util.Map;

public class equalPairs_6125 {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                s += "*" + grid[i][j];
            }
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                s += "*" + grid[j][i];
            }
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        int res = 0;

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            if (map2.containsKey(k)) {
                res += v * map2.get(k);
            }
        }
        return res;
    }
}
