package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class divide_29 {
    public int divide(int dividend, int divisor) {
        // 60/8 = (60-32)/8 + 4 = (60-32-16)/8 + 2 + 4 = (60-32-16-8)/8 + 1 + 2 + 4 = 0 + 1 + 2 + 4 = 7
        if (dividend == 1 << 31 && divisor == -1) return (1 << 31) - 1;
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int res = 0;
        // dividend=-2147483648  divisor=1 时 Math.abs(dividend) = -2147483648
        // 且 a >= b 不满足，但是 a - b >= 0满足
//        while (a >= b) {
        while (a - b >= 0) {
            int x = 1;
            int tmp = b;
            while (a - (tmp << 1) >= 0) {
                tmp <<= 1;
                x <<= 1;
            }
            res += x;
            a -= tmp;
        }

           /* int a = Math.abs(dividend), b = Math.abs(divisor), res = 0, x = 0;
            while (a - b >= 0) {
                for (x = 0; a - (b << x << 1) >= 0; x++) ;
                res += 1 << x;
                a -= b << x;
            }*/
        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
}
