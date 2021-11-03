package algo.tzashinorpu.SecondRound.Chapter08;

public class myPow_050 {
    public double myPow(double x, int n) {
        Long N = Long.valueOf(n);
        if (N == 0) {
            return 1;
        }
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return dfs(x, N);
    }

    private double dfs(double x, Long n) {
        if (n == 1) {
            return x;
        }
        // 2^5 = 2^2*2^2*2
        double v = dfs(x, n / 2);
        double fac = n % 2 == 0 ? 1 : x;
        return v * v * fac;
    }
}
