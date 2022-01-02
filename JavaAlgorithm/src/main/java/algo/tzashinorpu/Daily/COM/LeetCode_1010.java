package algo.tzashinorpu.Daily.COM;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_1010 {
    private int res = 0;

    // 超时
    public int numPairsDivisibleBy60Dfs(int[] time) {
        // 30,20,150,100,40
        for (int i = 0; i < time.length; i++) {
            dfs(i, time[i], 0, time);
        }
        return res;
    }

    private void dfs(int index, int sum, int level, int[] time) {
        if (sum % 60 == 0 && level == 1) {
            this.res++;
            return;
        }
        if (level == 1) {
            return;
        }
        for (int i = index + 1; i < time.length; i++) {
            dfs(i, sum + time[i], level + 1, time);
        }
    }

    // two sum
    public int numPairsDivisibleBy60(int[] time) {
        // 60,60,60
        int length = time.length;
        int cnt = 0;
        int[] remains = new int[60];
        for (int i = 0; i < length; i++) {
            int target = (60 - time[i] % 60) % 60;
            // 第三个 60 可以和前两个 60 组成两个解
            cnt += remains[target];
            remains[time[i] % 60]++;
        }
        return cnt;
    }
}
