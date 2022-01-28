package algo.tzashinorpu.Daily.CN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class numberOfWeakCharacters_1996 {
    public int numberOfWeakCharacters(int[][] properties) {
        int n = properties.length, ans = 0;
        Arrays.sort(properties, (a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0];
            return b[1] - a[1];
        });
        for (int i = 0, max = properties[0][1]; i < n; ) {
            int j = i;
            while (j < n && properties[j][0] == properties[i][0]) {
                if (i != 0 && properties[j][1] < max) ans++;
                j++;
            }
            max = Math.max(max, properties[i][1]);
            i = j;
        }
        return ans;
    }
}
