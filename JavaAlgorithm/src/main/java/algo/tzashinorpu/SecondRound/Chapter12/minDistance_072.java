package algo.tzashinorpu.SecondRound.Chapter12;

public class minDistance_072 {
    public int minDistance(String word1, String word2) {
        //       h  o  r  s  e
        //    0  1  2  3  4  5
        // r  1  1  2  2  3  4
        // o  2  2  1  2  3  4
        // s  3  3  2  2  2  3
//        知道"abcd"变成"fgh"多少步（假设X步），那么从"abcde"到"fgh"就是"abcde"->"abcd"->"fgh"。（一次删除，加X步，总共X+1步）
//        知道"abcde"变成“fg”多少步（假设Y步），那么从"abcde"到"fgh"就是"abcde"->"fg"->"fgh"。（先Y步，再一次添加，加X步，总共Y+1步）
//        知道"abcd"变成“fg”多少步（假设Z步），那么从"abcde"到"fgh"就是"abcde"->"fge"->"fgh"。
//        （先不管最后一个字符，把前面的先变好，用了Z步，然后把最后一个字符给替换了。这里如果最后一个字符碰巧就一样，那就不用替换，省了一步）
        int cols = word1.length();
        int rows = word2.length();
        if (rows * cols == 0) {
            return rows + cols;
        }
        int[][] dp = new int[rows + 1][cols + 1];
        for (int i = 0; i <= rows; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= cols; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                char c1 = word2.charAt(i - 1);
                char c2 = word1.charAt(j - 1);
                int step = Math.min((c1 == c2) ? dp[i - 1][j - 1] : dp[i - 1][j - 1] + 1, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
                dp[i][j] = step;
            }
        }
        return dp[rows][cols];
    }
}
