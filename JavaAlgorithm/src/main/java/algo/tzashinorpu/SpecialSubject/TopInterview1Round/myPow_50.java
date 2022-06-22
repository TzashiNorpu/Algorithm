package algo.tzashinorpu.SpecialSubject.TopInterview1Round;

public class myPow_50 {
    public double myPow(double x, int n) {
        // (-2)^3   2^(-3)
        double _x = n < 0 ? 1 / x : x;
        if (n == 0) {
            if (x == 0) return 0;
            return 1;
        }
        if (x == 1) return 1;
        long _n = Math.abs((long) n);
//        return recursive(_x, _n);
        return mul(_x, _n);
    }

    private double recursive(double x, long n) {
        if (n == 1) {
            return x;
        }
        double t = recursive(x, n / 2);
        return n % 2 == 0 ? t * t : x * t * t;
    }

    private double mul(double a, long n) {
        // 0.5*5(0101)
        double ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) ans *= a;
            n >>= 1;
            a *= a;
        }
        return ans;
    }
}
