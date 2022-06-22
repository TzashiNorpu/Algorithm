package algo.tzashinorpu.SpecialSubject.TopInterview1Round;

import java.util.HashMap;
import java.util.Map;

public class romanToInt_13 {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> m1 = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        Map<String, Integer> m2 = new HashMap<>() {{
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }};
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            char c1 = chars[i];
            if (i > 0) {
                char c2 = chars[i - 1];
                if (m2.containsKey(c2 + "" + c1)) {
                    res += m2.get(c2 + "" + c1);
//                    i -= 2;
                    i--;
                } else {
                    res += m1.get(c1);
//                    i--;
                }
            } else {
                res += m1.get(c1);
//                i--;
            }
        }
        return res;
    }
}
