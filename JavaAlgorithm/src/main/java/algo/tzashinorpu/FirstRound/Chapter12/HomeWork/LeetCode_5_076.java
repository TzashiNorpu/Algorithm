package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_5_076 {
    // https://leetcode-cn.com/problems/minimum-window-substring
    public String minWindow(String s, String t) {
        char[] source = s.toCharArray();
        char[] dest = t.toCharArray();
        int lastL = 0, lastR = s.length();
        int l = 0, r = 0;
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < dest.length; i++) {
            charCount.put(dest[i], 0);
        }
        for (l = 0, r = 0; l <= r && r < source.length; ) {
            if (charCount.containsKey(source[r])) {
                charCount.put(source[r], charCount.get(source[r]) + 1);
            }
            r++;
            while (cotains(charCount, t)) {
                if (charCount.containsKey(source[l])) {
                    charCount.put(source[l], charCount.get(source[l]) - 1);
                }
                l++;
                if ((r - l) < (lastR - lastL)) {
                    lastL = l - 1;
                    lastR = r - 1;
                }
            }
        }
        return s.substring(lastL, lastR + 1);
    }

    private boolean cotains(HashMap<Character, Integer> charCount, String dest) {
        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            cnt += entry.getValue();
            if (entry.getValue() <= 0) {
                return false;
            }
        }
        return cnt >= dest.length();
    }
}
