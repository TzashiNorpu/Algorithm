package algo.tzashinorpu.FirstRound.Chapter07;

public class LeetCode_2_070 {
    // 爬楼梯  f(n) = f(n-1) + f(n-2)
    // 递归一:第n阶台阶可以从第n-1阶和n-2阶上来
    public int climbStairs1(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs1(n - 1) + climbStairs1(n - 2);
    }

    // 递归一的记忆化递归
    public int climbStairs1_1(int n, int[] res) {
        if (n <= 2) {
            res[n] = n;
            return res[n];
        }
        if (res[n] > 0) {
            return res[n];
        }
        return res[n] = climbStairs1_1(n - 1, res) + climbStairs1_1(n - 2, res);
//        return res[n];
    }

    // 递归二:每次可以上1阶或2阶
    public int climbStairs3(int n) {
        return climb_Stairs3(0, n);
    }

    private int climb_Stairs3(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs3(i + 1, n) + climb_Stairs3(i + 2, n);
    }

    // 递归二的记忆化递归
    public int climbStairs3_1(int n) {
        int[] res = new int[n + 1];
        return climb_Stairs3_1(0, n, res);
    }

    private int climb_Stairs3_1(int i, int n, int[] res) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (res[i] > 0) {
            return res[i];
        }
        return res[i] = climb_Stairs3(i + 1, n) + climb_Stairs3(i + 2, n);
    }

    // 动态规划
    // 时间/空间 = o(n)/o(n)
    public int climbStairs2(int n) {
        int[] cnts = new int[n];

        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }
        cnts[0] = 1;
        cnts[1] = 2;
        for (int i = 2; i < n; i++) {
            cnts[i] = cnts[i - 1] + cnts[i - 2];
        }
        return cnts[n - 1];
    }

    // Fibonacci : Fib(n)=Fib(n−1)+Fib(n−2)
    public int climbStairs4(int n) {
        if (n <= 2) {
            return n;
        }
        int prev_prev = 1;
        int prev = 2;
        for (int i = 2; i < n; i++) {
            int cur = prev_prev + prev;
            prev_prev = prev;
            prev = cur;
        }
        return prev;
    }

    public static void main(String[] args) {
        LeetCode_2_070 test = new LeetCode_2_070();
        int n = 3;
        int[] res = new int[n + 1];
//        int cnts = algo.tzashinorpu.test.climbStairs1(3);
//        algo.tzashinorpu.test.climbStairs1_1(n, res);
//        System.out.println(res[n]);
//        int cnts = algo.tzashinorpu.test.climbStairs2(n);
//        System.out.println(cnts);
        int cnts = test.climbStairs3_1(5);
        System.out.println(cnts);
        int cnt2 = test.climbStairs4(5);
        System.out.println(cnt2);
    }
}
