package algo.tzashinorpu.FirstRound.test;

/**
 * 在一个回文串中，只有最多一个字符出现了奇数次，其余的字符都出现偶数次
 * 如何通过给定的字符构造一个回文串呢？
 * 将每个字符使用偶数次，使得它们根据回文中心对称。在这之后，如果有剩余的字符，我们可以再取出一个，作为回文中心
 */
public class LT409 {
    public static void main(String[] args) {
        String s1 = "abccccdd";
        System.out.println(longestPalindrome(s1));
        String s2 = "aaabbb"; // abababa
        System.out.println(longestPalindrome(s2));
        s2 = "aaabbbb";
        System.out.println(longestPalindrome(s2));
    }

    static int longestPalindrome(String s) {
        int res = 0;
        //int totalCnt = 0;
        int[] c = new int[58];
        for (char t : s.toCharArray()) {
            c[t - 'A']++;
            //totalCnt++;
        }
        for (int i : c) {
            // res += i / 2 * 2;
            // 011 - 011 & 001 = 011 - 001 = 2
            // 010 - 010 & 001 = 010 - 000 = 2
            res += i - (i & 1);
        }
        return s.length() > res ? res + 1 : res;
    }
}
