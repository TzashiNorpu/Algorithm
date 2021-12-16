package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_647_1 {
    public int countSubstringsDp(String s) {
        // dp[i][j] 表示字符串s在[i,j]区间的子串是否是一个回文串
        // 状态转移方程：当 s[i] == s[j] && (j - i < 2 || dp[i + 1][j - 1]) 时，dp[i][j]=true，否则为false
        //当只有一个字符时，比如 a 自然是一个回文串。
        //当有两个字符时，如果是相等的，比如 aa，也是一个回文串。
        //当有三个及以上字符时，比如 ababa 这个字符记作串 1，把两边的 a 去掉，也就是 bab 记作串 2，可以看出只要串2是一个回文串，那么左右各多了一个 a 的串 1 必定也是回文串。所以当 s[i]==s[j] 时，自然要看 dp[i+1][j-1] 是不是一个回文串。
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        char[] chars = s.toCharArray();
        int n = 0;
        for (int j = 0; j < length; j++) {
            for (int i = 0; i <= j; i++) {
                if (chars[i] == chars[j] && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    n++;
                }
            }
        }
        return n;
    }

    public int countSubstringsM(String s) {
        int midLen = s.length() * 2 - 1;
        int res = 0;
        //  "abcd" -> 0,1,2,3,4,5,6,7
        //          l:0,0,1,1,2,2,3,3
        //          r:0,1,1,2,2,3,3,4
        for (int i = 0; i < midLen; i++) {
            int l = i / 2;
            int r = l + i % 2;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                res++;
                l--;
                r++;
            }
        }
        return res;
    }
}
