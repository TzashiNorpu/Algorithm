package algo.tzashinorpu.FirstRound.Chapter10;

import java.util.Arrays;

public class LeetCode_3_455_1 {
    public int findContentChildren(int[] g, int[] s) {
        int n = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while (i < s.length && j < g.length) {
            if (s[i] >= g[j]) {
                n++;
                j++;
            }
            i++;
        }
        return n;
    }
}
