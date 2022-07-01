package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class isPalindrome_125 {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        for (int l = 0, r = chars.length - 1; l < r; ) {
            while (l < r && !Character.isAlphabetic(chars[l]) && !Character.isDigit(chars[l])) {
                l++;
            }
            while (l < r && !Character.isAlphabetic(chars[r]) && !Character.isDigit(chars[r])) {
                r--;
            }
            if (Character.toLowerCase(chars[l]) != Character.toLowerCase(chars[r])) return false;
            l++;
            r--;
        }
        return true;
    }
}
