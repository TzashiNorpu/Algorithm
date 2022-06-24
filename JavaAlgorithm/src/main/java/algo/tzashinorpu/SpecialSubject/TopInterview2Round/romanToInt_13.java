package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.HashMap;

public class romanToInt_13 {
    private HashMap<Character, Integer> map = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int res = 0;
        /*for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'V') {
                        res += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        res += 9;
                        i++;
                    } else {
                        res += 1;
                    }
                } else res += 1;
            } else if (s.charAt(i) == 'X') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'L') {
                        res += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        res += 90;
                        i++;
                    } else {
                        res += 10;
                    }
                } else res += 10;
            } else if (s.charAt(i) == 'C') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'D') {
                        res += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        res += 900;
                        i++;
                    } else {
                        res += 100;
                    }
                } else res += 100;
            } else {
                res += map.get(s.charAt(i));
            }
        }*/
        s = s.replace("IV", "IIII").replace("IX", "VIII").replace("XL", "XXXX").replace("XC", "LXXXX").replace("CD", "CCCC").replace("CM", "DCCCC");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res += map.get(c);
        }

        return res;
    }
}
