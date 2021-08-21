package algo.tzashinorpu.Week01.Chapter03.Array;

public class LeetCode_1_070 {
    // https://leetcode-cn.com/problems/climbing-stairs/solution/pa-lou-ti-by-leetcode/
    // 爬楼梯
    // 简单递归
    private int climbStairs1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs1(n - 1) + climbStairs1(n - 2);
    }

    // 缓存中间结果
    private int climbStairs2(int n) {
        // 不需要 n=1 return
        // 0 索引未使用
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // Fibonacci
    private int climbStairs3(int n) {
//        if (n == 1) {
//            return 1;
//        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        LeetCode_1_070 test = new LeetCode_1_070();
        System.out.printf("climbStairs1=%d\n", test.climbStairs1(5));
        System.out.printf("climbStairs2=%d\n", test.climbStairs2(5));
        System.out.printf("climbStairs3=%d\n", test.climbStairs3(5));
    }
}
