package algo.tzashinorpu.SecondRound.Chapter07;

public class climbStairs_070 {
    public int climbStairs1(int n) {
        if (n == 3 || n == 2) {
            return n;
        }
        return climbStairs1(n - 1) + climbStairs1(n - 2);
    }

    public int climbStairs2(int n) {
        if (n < 3) {
            return n;
        }
        int pprev = 1;
        int prev = 2;
        int curr = prev + pprev;
        for (int i = 3; i <= n; i++) {
            curr = pprev + prev;
            pprev = prev;
            prev = curr;
        }
        return curr;
    }
}
