package algo.tzashinorpu.SecondRound.Chapter03;

public class climbStairs_070 {
    public int climbStairs(int n) {
        int[] ints = new int[Math.max(n, 3)];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        for (int i = 3; i < n; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[n - 1];
    }
}
