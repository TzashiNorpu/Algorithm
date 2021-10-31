package algo.tzashinorpu.SecondRound.Chapter05;

import java.util.HashMap;

public class isAnagram_242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> cntMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < sChars.length; i++) {
            char sChar = sChars[i];
            char tChar = tChars[i];
            if (sChar == tChar) {
                continue;
            }
            cntMap.put(sChar, cntMap.getOrDefault(sChar, 0) + 1);
            cntMap.put(tChar, cntMap.getOrDefault(tChar, 0) - 1);
        }
        /*for (char c : s.toCharArray()) {
            Integer count = cntMap.getOrDefault(c, 0);
            cntMap.put(c, count + 1);
        }
        for (char c : t.toCharArray()) {
            Integer count = cntMap.getOrDefault(c, 2);
            cntMap.put(c, count - 1);
        }*/
        for (Integer cnt : cntMap.values()) {
            if (cnt != 0) {
                return false;
            }
        }
        return true;
    }
}
