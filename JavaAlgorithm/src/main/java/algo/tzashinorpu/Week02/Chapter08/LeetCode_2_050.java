package algo.tzashinorpu.Week02.Chapter08;

public class LeetCode_2_050 {
    /*public double myPow1(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return myPow_1(x, n);
    }

    private double myPow_1(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        return x * myPow_1(x, n - 1);
    }*/

    public double myPow1(double x, int n) {
        long N = n;
        if (x == 0) {
            return 0;
        }
        if (N == 0 || x == 1) {
            return 1;
        }
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double res = 1;
        for (int i = 0; i < N; i++) {
            res *= x;
        }
        return res;
    }

    public double myPow2(double x, int n) {
        long N = n;
        if (x == 0) {
            return 0;
        }
        if (N == 0 || x == 1) {
            return 1;
        }
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return myPow_2(x, N);
    }

    private double myPow_2(double x, long n) {
        // 2 ^ 9
        // 2 ^ 4 * 2^4 * 2
        // 2 ^ 2 * 2 ^ 2
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double temp = myPow_2(x, n / 2);
        return temp * temp * (n % 2 == 1 ? x : 1);
    }


    public double myPow3(double x, int n) {
        long N = n;
        if (x == 0) {
            return 0;
        }
        if (N == 0 || x == 1) {
            return 1;
        }
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return myPow_3(x, N);
    }

    //  5 = 101 = (1*2^2+0*2^1+1*2^0)=>只需要二进制位为1的位数：(2^(i[k])+2^(i[k-1]+...+2^(i[0])))
    // x^5 = x^(1*2^2+0*2^1+1*2^0) = x^2^2*x^2^0
    private double myPow_3(double x, long n) {
        double res = 1;
        double contribute = x;
        while (n > 0) {
            if (n % 2 == 1) {
                res *= contribute;
            }
            contribute *= contribute;
            n = n / 2;
        }
        return res;
    }
}
