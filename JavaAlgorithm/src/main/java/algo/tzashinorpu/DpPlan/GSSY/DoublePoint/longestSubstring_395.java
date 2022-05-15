package algo.tzashinorpu.DpPlan.GSSY.DoublePoint;

import java.util.Arrays;

public class longestSubstring_395 {
    public int longestSubstringSlide(String s, int k) {
        int ans = 0;
        int n = s.length();
        char[] cs = s.toCharArray();
        int[] cnt = new int[26];
        // 区间内可能有这么个字符种类
        for (int p = 1; p <= 26; p++) {
            Arrays.fill(cnt, 0);
            for (int i = 0, j = 0, tot = 0, sum = 0; i < n; i++) {
                int u = cs[i] - 'a';
                cnt[u]++;
                if (cnt[u] == 1) tot++;
                if (cnt[u] == k) sum++;
                // 当前区间内字符种类大于预定的种类
                while (tot > p) {
                    int t = cs[j++] - 'a';
                    cnt[t]--;
                    if (cnt[t] == 0) tot--;
                    if (cnt[t] == k - 1) sum--;
                }
                // 这个区间内的字符种类和满足要求的字符数量相等 -> 即这个区间内每一种字符都满足要求
                if (tot == sum) ans = Math.max(ans, i - j + 1);
            }
        }
        return ans;
    }

    public int longestSubstringDivide(String s, int k) {
        int ans = 0;
        int n = s.length();
        char[] cs = s.toCharArray();

        return ans;
    }
}
