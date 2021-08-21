package algo.tzashinorpu.Week05.Chapter12.HomeWork;

public class LeetCode_5_647 {
    // https://leetcode-cn.com/problems/palindromic-substrings/
    // 给定一个字符串   计算这个字符串中有多少个回文子串
    private int count = 0;

    private void extendPalindrome(String s, int left, int right) {
        System.out.println("*****");
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            System.out.printf("l=%d,ls=%s,r=%d,rs=%s\n", left, s.charAt(left), right, s.charAt(right));
            count++;
            left--;
            right++;
        }
    }

    private int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;

        for (int i = 0; i < s.length(); i++) {
            extendPalindrome(s, i, i); // 处理奇数个的回文字符  l=1,r=1时，得到"aaa" => l=0到r=1区间的回文 "aaa"
            extendPalindrome(s, i, i + 1); // 处理偶数个的回文字符 l=1,r=2时，得到"aaaa" => l=0到r=3区间的回文 "aaaa"
        }
        return count;
    }

    public static void main(String[] args) {
        final String s = "aabaa";//  "aab";
        final LeetCode_5_647 test = new LeetCode_5_647();
        System.out.println(test.countSubstrings(s));
    }
}
