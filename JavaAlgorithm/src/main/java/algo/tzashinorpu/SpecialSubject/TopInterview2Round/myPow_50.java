package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class myPow_50 {
    public double myPow(double x, int n) {
        double a = (n < 0 ? 1 / x : x);
        //-214748364 : 不先转换先取反是不对滴
        long b = n < 0 ? -(long) n : n;
        return dfs(a, b);
    }

    private double dfs(double a, long n) {
        if (a == 0) return 0;
        if (n == 0) return 1;
        if (n == 1) return a;
        double t = dfs(a, n / 2);
        return t * t * (n % 2 == 1 ? a : 1);
    }
}
