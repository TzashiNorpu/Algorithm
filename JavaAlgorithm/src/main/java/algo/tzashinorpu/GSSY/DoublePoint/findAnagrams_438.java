package algo.tzashinorpu.GSSY.DoublePoint;

import java.util.ArrayList;
import java.util.List;

public class findAnagrams_438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] cnt = new int[26];
        char[] sc = s.toCharArray();
        char[] ps = p.toCharArray();
        // 字符种类+词频
        for (int i = 0; i < ps.length; i++) cnt[ps[i] - 'a']++;
        int a = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] != 0) a++;
        }
        // 右指针抵消p串词频  左指针恢复p串词频
        for (int l = 0, r = 0, b = 0; r < sc.length; r++) {
            if (--cnt[sc[r] - 'a'] == 0) b++;
            // 移动左边 == 1 -> 只恢复一次
            if (r - l + 1 > ps.length && ++cnt[sc[l++] - 'a'] == 1) b--;
            if (a == b) res.add(l);
        }
        return res;
    }
}
