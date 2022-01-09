package algo.tzashinorpu.WeekContest.D0108;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class longestPalindrome_5962 {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int res = 0;
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);

            if (!isValid(word) && map.getOrDefault(word, 0) >= 1 && map.getOrDefault(reverse(word), 0) >= 1) {
                res += 4;
                map.put(word, map.get(word) - 1);
                map.put(reverse(word), map.get(reverse(word)) - 1);
            }
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        int count = 0;
        boolean odd = false;
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            if (isValid(next.getKey())) {
                Integer cnt = next.getValue();
                if (cnt / 2 >= 1) {
                    count += (cnt / 2) * 4;
                }
                if (cnt % 2 == 1) {
                    odd = true;
                }
            }
        }
        return res + count + (odd ? 2 : 0);
    }

    private String reverse(String s) {
        char[] chars = s.toCharArray();
        char tmp = chars[0];
        chars[0] = chars[1];
        chars[1] = tmp;
        return new String(chars);
    }

    private boolean isValid(String s) {
        char[] chars = s.toCharArray();
        return chars[0] == chars[1];
    }
}
