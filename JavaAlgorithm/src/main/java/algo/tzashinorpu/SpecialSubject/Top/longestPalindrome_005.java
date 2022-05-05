package algo.tzashinorpu.SpecialSubject.Top;

public class longestPalindrome_005 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int start = 0, end = 0;
        for (int i = 0; i < chars.length; i++) {
            int len1 = findPalindrom(chars, i, i);
            int len2 = findPalindrom(chars, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int findPalindrom(char[] s, int left, int right) {
        while (left >= 0 && right < s.length && s[left] == s[right]) {
            --left;
            ++right;
        }
        return right - left - 1;
    }
}
