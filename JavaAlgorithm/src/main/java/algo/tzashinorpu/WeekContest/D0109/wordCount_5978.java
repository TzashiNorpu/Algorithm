package algo.tzashinorpu.WeekContest.D0109;

import java.util.Arrays;
import java.util.HashSet;

public class wordCount_5978 {
    public int wordCount(String[] startWords, String[] targetWords) {
        HashSet<String> set = new HashSet<>();
        for (String s : startWords) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            set.add(new String(chars));
        }
        int cnt = 0;
        for (String s : targetWords) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String s1 = new String(chars);
            for (int i = 0; i < chars.length; i++) {
                if (set.contains(s1.substring(0, i) + s1.substring(i + 1))) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}
