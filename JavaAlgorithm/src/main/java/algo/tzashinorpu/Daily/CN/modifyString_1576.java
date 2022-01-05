package algo.tzashinorpu.Daily.CN;

import java.util.Arrays;

public class modifyString_1576 {
    public String modifyString(String s) {
        // ???? -> abab x
        // b?a -> bca
        char[] chars = s.toCharArray();
        for (int i = 0, temp = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                while ((i >= 1 && temp == chars[i - 1] - 'a') || (i < chars.length - 1 && temp == chars[i + 1] - 'a')) {
                    temp++;
                }
                chars[i] = (char) ('a' + (temp++ % 26));
            }
        }
        return new String(chars);
    }
}
