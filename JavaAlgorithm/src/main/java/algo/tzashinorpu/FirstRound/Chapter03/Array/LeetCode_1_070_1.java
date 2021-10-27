package algo.tzashinorpu.FirstRound.Chapter03.Array;

public class LeetCode_1_070_1 {
    // recursive
    /*public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }*/
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] steps = new int[n + 1];
        steps[1] = 1;
        steps[2] = 2;
        for (int i = 3; i <= n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n];
    }

    public static void main(String[] args) {
        LeetCode_1_070_1 solution = new LeetCode_1_070_1();
        int steps = solution.climbStairs(20);
        System.out.println(steps);
    }
}
