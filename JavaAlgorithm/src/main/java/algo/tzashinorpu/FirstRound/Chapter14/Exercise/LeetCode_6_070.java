package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

public class LeetCode_6_070 {

    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        // 如何剪枝?
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
