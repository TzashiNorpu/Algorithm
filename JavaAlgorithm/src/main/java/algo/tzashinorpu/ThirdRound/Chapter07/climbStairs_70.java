package algo.tzashinorpu.ThirdRound.Chapter07;

public class climbStairs_70 {
    public int climbStairs(int n) {
        // 记忆化递归
        int[] cache = new int[n + 1];
        return recursive(cache, n);
    }

    private int recursive(int[] cache, int n) {
        // 1,2,3,5
        if (n <= 3) return n;
        if (cache[n] > 0) {
            return cache[n];
        }
        return cache[n] = recursive(cache, n - 1) + recursive(cache, n - 2);
    }
}
