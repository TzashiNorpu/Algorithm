package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class mySqrt_69 {
    public int mySqrt(int x) {
        long l = 1, r = x;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (mid * mid <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return (int) r;
    }
}
