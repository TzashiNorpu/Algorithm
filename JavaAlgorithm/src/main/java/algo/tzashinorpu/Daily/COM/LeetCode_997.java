package algo.tzashinorpu.Daily.COM;

import java.util.HashMap;

public class LeetCode_997 {
    public int findJudge(int n, int[][] trust) {
        /*HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] temp : trust) {
            map.put(temp[1], map.getOrDefault(temp[1], 0) + 1);
            map.put(temp[0], map.getOrDefault(temp[0], 0) - 1);
        }
        for (int i = 1; i <= n; i++) {
            if (map.getOrDefault(i, 0) == n - 1) {
                return i;
            }
        }
        return -1;*/
        int[] count = new int[n];
        for (int[] temp : trust) {
            count[temp[1] - 1]++;
            count[temp[0] - 1]--;
        }
        for (int i = 1; i <= n; i++) {
            if (count[i - 1] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
