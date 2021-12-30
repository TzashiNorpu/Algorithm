package algo.tzashinorpu.SecondRound.Chapter11;

public class isPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (num / mid < mid) {
                r = mid - 1;
            } else if (num / mid > mid) {
                l = mid + 1;
            } else if (num % mid == 0) {
                // 不加取模则 5 的时候会误触
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
