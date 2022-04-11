package algo.tzashinorpu.ThirdRound.Chapter05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class isAnagram_242 {
    public boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            cnt[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (cnt[i] != 0) return false;
        }
        return true;
    }
}
