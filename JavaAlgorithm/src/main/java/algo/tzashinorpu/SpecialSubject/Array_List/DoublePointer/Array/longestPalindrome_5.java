package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

import java.util.HashMap;

public class longestPalindrome_5 {
    public String longestPalindrome_1(String s) {
        int maxLen = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            int len1 = findPalindrome(s, i, i);
            int len2 = findPalindrome(s, i, i + 1);
            if (Math.max(len1, len2) > maxLen) {
                maxLen = Math.max(len1, len2);
                int start = i - (maxLen - 1) / 2;
                int end = start + maxLen;
                res = s.substring(start, end);
            }
        }
        return res;
    }

    private int findPalindrome(String s, int i1, int i2) {
        while (i1 >= 0 && i2 < s.length() && s.charAt(i1) == s.charAt(i2)) {
            i1--;
            i2++;
        }
        return i2 - i1 - 1;
    }

    public int longestPalindrome_2(String s) {
        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0;
        int res = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            window.put(c, window.getOrDefault(c, 0) + 1);
            while (window.get(c) > 1) {
                char d = s.charAt(left);
                // 缩⼩窗⼝
                left++;
                window.put(d, window.getOrDefault(d, 0) - 1);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
