package algo.tzashinorpu.FourthRound.Chapter11;

public class isPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        long l = -1, r = (long) num + 1;
        long mid;
        while (l + 1 != r) {
            mid = (l + r) / 2;
            if (mid * mid == num) {
                return true;
            }
            if (mid * mid > num) {
                r = mid;
            }
            if (mid * mid < num) {
                l = mid;
            }
        }
        return false;
    }
}
