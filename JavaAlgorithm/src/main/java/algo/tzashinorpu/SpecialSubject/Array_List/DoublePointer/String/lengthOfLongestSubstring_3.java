package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.String;

import java.util.HashMap;

public class lengthOfLongestSubstring_3 {
    public int lengthOfLongestSubstring_1(String s) {
        int res = 0;
        int begin = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= begin) {
                begin = map.get(c) + 1;
            }
            if (i - begin + 1 > res) res = i - begin + 1;
            map.put(c, i);
        }
        return res;
    }

    public int lengthOfLongestSubstring_2(String s) {
        int len = 0;
        int l = 0, r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        while (r < chars.length) {
            char rChar = chars[r++];
            map.put(rChar, map.getOrDefault(rChar, 0) + 1);
            while (map.get(rChar) > 1) {
                char lChar = chars[l++];
                map.put(lChar, map.get(lChar) - 1);
            }
            len = Math.max(len, r - l);
        }
        return len;
    }

}
