package algo.tzashinorpu.Week02.Chapter07;

public class LeetCode_2_070_1 {
    // recursive 反向递归
    public int climbStairs1(int n) {
        if (n < 4) {
            return n;
        }
        return climbStairs1(n - 1) + climbStairs1(n - 2);
    }

    // 反向记忆化递归
    public int climbStairs1_1(int n) {
        if (n < 4) {
            return n;
        }
        int[] res = new int[n+1];
        return climbStairs1_1(n - 1,res)+climbStairs1_1(n - 2,res);
    }

    private int climbStairs1_1(int i, int[] res) {
        if (i < 4) {
            res[i] = i;
            return res[i];
        }
        if (res[i] > 0) {
            return res[i];
        }
        return res[i] = climbStairs1_1(i-1,res)+climbStairs1_1(i-2,res);
    }

    // recursive 正向递归
    public int climbStairs6(int n) {
        return climbStairs6(0, n);
    }
    // i --> n => i+1-->n + i+2-->n
    private int climbStairs6(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climbStairs6(i+1,n)+climbStairs6(i+2,n);
    }

    // 正向记忆化递归
    public int climbStairs6_1(int n) {
        if (n < 4) {
            return n;
        }
        int[][] res = new int[n + 2][n+1];
        return climbStairs6_1(0, n,res);
    }

    private int climbStairs6_1(int i, int n,int[][] res) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (res[i][n] > 0) {
            return res[i][n];
        }
        res[i+1][n] = climbStairs6_1(i + 1, n, res);
        res[i+2][n] = climbStairs6_1(i+2, n,res);
        return res[i+1][n]+res[i+2][n];
    }


    // dynamic
    public int climbStairs2(int n) {
        if (n < 4) {
            return n;
        }
        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;
        res[3] = 3;
        for (int i = 4; i <= n; i++) {
            res[i] = res[i-1] + res[i-2];
        }
        return res[n];
    }

    // Fibonacci
    public int climbStairs3(int n) {
        if (n < 4) {
            return n;
        }
        int prev_prev = 2;
        int prev = 3;
        int curr = prev + prev_prev;
        for (int i = 4; i <= n; i++) {
            curr = prev + prev_prev;
            prev_prev = prev;
            prev = curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        LeetCode_2_070_1 sol = new LeetCode_2_070_1();
        System.out.println(sol.climbStairs6_1(20));
    }
}
