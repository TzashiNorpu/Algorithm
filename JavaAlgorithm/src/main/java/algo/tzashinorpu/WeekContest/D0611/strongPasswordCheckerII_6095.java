package algo.tzashinorpu.WeekContest.D0611;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class strongPasswordCheckerII_6095 {
    Set<Character> set;

    public boolean strongPasswordCheckerII(String password) {
        set = new HashSet<>();
        set.addAll(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
        int little = 0;
        int upper = 0;
        int num = 0;
        int special = 0;
        boolean two = false;
        int length = password.length();
        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (c >= 'a' && c <= 'z') little++;
            if (c >= 'A' && c <= 'Z') upper++;
            if (Character.isDigit(c)) num++;
            if (set.contains(c)) special++;
        }
        for (int i = 0; i < length - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                two = true;
                break;
            }
        }
        if (length < 8) return false;
        if (little < 1) return false;
        if (upper < 1) return false;
        if (num < 1) return false;
        if (special < 1) return false;
        return !two;
    }
}
