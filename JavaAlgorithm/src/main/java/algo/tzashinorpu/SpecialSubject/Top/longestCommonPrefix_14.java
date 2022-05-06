package algo.tzashinorpu.SpecialSubject.Top;

public class longestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        int cnt = 0;
        int len = 0;
        String tmp = strs[0];
        char[] chars = tmp.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char a = chars[i];
            for (int j = 0; j < strs.length; j++) {
                if (i == strs[j].length()) {
                    return strs[j].substring(0, len);
                }
                if (strs[j].charAt(i) == a) {
                    cnt++;
                }
            }
            if (cnt != strs.length) {
                return strs[0].substring(0, len);
            } else {
                len++;
                cnt = 0;
            }
        }
        return strs[0].substring(0, len);
    }
}
