package algo.tzashinorpu.FirstRound.Chapter11;

public class LeetCode_3_367 {
    public boolean isPerfectSquare(int num) {
        if (num <= 1) {
            return true;
        }
        int l = 0;
        int r = num;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (mid < num / mid) {
                l = mid + 1;
            } else if (mid > num / mid) {
                r = mid - 1;
            } else {
                return mid * mid == num;
            }
        }
        return false;
    }
}
