package algo.tzashinorpu.WeekContest.D0918;

public class longestContinuousSubstring_6181 {
    public int longestContinuousSubstring(String s) {
        int res = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int tmp = 1;
            while (i < chars.length - 1 && chars[i + 1] == chars[i] + 1) {
                tmp++;
                i++;
            }
            res = Math.max(res, tmp);
        }
        return res;
    }
}
