package algo.tzashinorpu.ThirdRound.Chapter08;

public class myPow_50 {
    public double myPow(double x, int n) {
        return pow(x, n);
    }

    private double pow(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n == 1) {
            return x;
        }
        double v = pow(x, n / 2);
        double e = v * v;
        return n % 2 == 0 ? e : e * x;
    }
}
