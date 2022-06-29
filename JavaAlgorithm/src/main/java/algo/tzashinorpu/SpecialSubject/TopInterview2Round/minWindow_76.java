package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.HashMap;

public class minWindow_76 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }
        int len = Integer.MAX_VALUE;
        int start = s.length();
        int count = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            char c1 = s.charAt(r);
            if (need.containsKey(c1)) {
                window.put(c1, window.getOrDefault(c1, 0) + 1);
                if (window.get(c1).equals(need.get(c1))) count++;
                while (count == need.size()) {
                    if (r - l + 1 < len) {
                        start = l;
                        len = r - l + 1;
                    }
                    char c2 = s.charAt(l++);
                    if (need.containsKey(c2)) {
                        if (window.get(c2).equals(need.get(c2))) count--;
                        window.put(c2, window.get(c2) - 1);
                        if (window.get(c2) == 0) {
                            window.remove(c2);
                        }
                    }
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
