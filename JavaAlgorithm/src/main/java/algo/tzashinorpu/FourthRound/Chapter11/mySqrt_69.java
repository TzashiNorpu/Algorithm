package algo.tzashinorpu.FourthRound.Chapter11;

public class mySqrt_69 {
    public int mySqrt(int x) {
        long l = -1;
        long r = (long) x + 1;
        long mid;
        while (l + 1 != r) {
            mid = (l + r) / 2;
            if (mid * mid == x) {
                return (int) mid;
            }
            if (mid * mid > x) {
                r = mid;
            }
            if (mid * mid < x) {
                l = mid;
            }
        }
        return (int) l;
    }
}
