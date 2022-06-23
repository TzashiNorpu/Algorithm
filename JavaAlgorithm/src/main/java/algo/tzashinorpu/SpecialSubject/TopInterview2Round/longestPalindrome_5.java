package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class longestPalindrome_5 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int max = 0, startIndex = 0, endIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            int len1 = getPalindromeLen(i, i, chars);
            int len2 = getPalindromeLen(i, i + 1, chars);
            int len = Math.max(len1, len2);
            if (len > max) {
                max = len;
                startIndex = i - (max - 1) / 2;
                endIndex = i + max / 2;
            }
        }
        return s.substring(startIndex, endIndex + 1);
    }

    private int getPalindromeLen(int i, int j, char[] chars) {
        while (i >= 0 && j < chars.length && chars[i] == chars[j]) {
            i--;
            j++;
        }
        return j - i - 1;
    }
}
