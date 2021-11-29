package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_072_1 {
    public int minDistance1(String word1, String word2) {
        /*啥叫编辑距离？我们说word1和word2的编辑距离为X，意味着word1经过X步，变成了word2，咋变的你不用管，反正知道就需要X步，并且这是个最少的步数。
        我们有word1和word2，我们定义dp[i][j]的含义为：word1的前i个字符和word2的前j个字符的编辑距离。意思就是word1的前i个字符，变成word2的前j个字符，最少需要这么多步。
        例如word1 = "horse", word2 = "ros"，那么dp[3][2]=X就表示"hor"和“ro”的编辑距离，即把"hor"变成“ro”最少需要X步。
        如果下标为零则表示空串，比如：dp[0][2]就表示空串""和“ro”的编辑距离
        定理一：如果其中一个字符串是空串，那么编辑距离是另一个字符串的长度。比如空串“”和“ro”的编辑距离是2（做两次“插入”操作）。再比如"hor"和空串“”的编辑距离是3（做三次“删除”操作）。
        定理二：当i>0,j>0时（即两个串都不空时）dp[i][j]=min(dp[i-1][j]+1,dp[i][j-1]+1,dp[i-1][j-1]+int(word1[i]!=word2[j]))。
        啥意思呢？举个例子，word1 = "abcde", word2 = "fgh",我们现在算这俩字符串的编辑距离，就是找从word1，最少多少步，能变成word2？那就有三种方式：
        知道"abcd"变成"fgh"多少步（假设X步），那么从"abcde"到"fgh"就是"abcde"->"abcd"->"fgh"。（一次删除，加X步，总共X+1步）
        知道"abcde"变成“fg”多少步（假设Y步），那么从"abcde"到"fgh"就是"abcde"->"fg"->"fgh"。（先Y步，再一次添加，加X步，总共Y+1步）
        知道"abcd"变成“fg”多少步（假设Z步），那么从"abcde"到"fgh"就是"abcde"->"fge"->"fgh"。（先不管最后一个字符，把前面的先变好，用了Z步，
        然后把最后一个字符给替换了。这里如果最后一个字符碰巧就一样，那就不用替换，省了一步）*/
        int len1 = word1.length() + 1;
        int len2 = word2.length() + 1;
        int[][] dp = new int[len1][len2];
        for (int i = 0; i < len1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < len2; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < len1; i++) {
            for (int j = 1; j < len2; j++) {
                dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + (word1.charAt(i - 1) != word2.charAt(j - 1) ? 1 : 0));
            }
        }
        return dp[len1 - 1][len2 - 1];
    }

    public int minDistance2(String word1, String word2) {
        int len1 = word1.length() + 1;
        int len2 = word2.length() + 1;
        int[] dp = new int[len2];
        for (int i = 0; i < len2; i++) {
            dp[i] = i;
        }
        int leftUp = 0;
        for (int i = 1; i < len1; i++) {
            leftUp = i - 1;
            for (int j = 1; j < len2; j++) {
                int tmp = dp[j];
                dp[j] = Math.min(Math.min(dp[j - 1] + 1, dp[j] + 1), leftUp + (word1.charAt(i - 1) != word2.charAt(j - 1) ? 1 : 0));
                leftUp = tmp;
            }
            dp[0] = i;
        }
        return dp[len2 - 1];
    }
}
