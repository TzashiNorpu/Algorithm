package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.HashMap;

public class lengthOfLongestSubstring_3 {
    // slide window
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> window = new HashMap<>();
        int max = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            while (window.get(c) > 1) {
                char lChar = s.charAt(l++);
                window.put(lChar, window.get(lChar) - 1);
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
