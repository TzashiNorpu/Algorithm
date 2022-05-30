package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.String;

import java.util.HashMap;

public class lengthOfLongestSubstring_3 {
    public int lengthOfLongestSubstring(String s) {
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
}
