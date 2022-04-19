package algo.tzashinorpu.ThirdRound.Chapter11;

public class mySqrt_69 {
    public int mySqrt(int x) {
        // newton method
        /*long r = x;
        while (r * r > x)
            r = (r + x / r) / 2;
        return (int) r;*/
        /*if (x == 0 || x == 1) {
            return x;
        }
        int l = 0, r = x / 2 + 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (mid < x / mid) {
                // mid * mid < x
                l = mid + 1;
            }
            if (mid > x / mid) {
                r = mid - 1;
            }
            if (mid == x / mid) {
                return mid;
            }
        }
        return r;*/
        long l = 0, r = x;
        long mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (mid * mid > x) {
                r = mid - 1;
            }
            if (mid * mid < x) {
                l = mid + 1;
            }
            if (mid * mid == x) {
                return (int) mid;
            }
        }
        return (int) r;
    }
}
