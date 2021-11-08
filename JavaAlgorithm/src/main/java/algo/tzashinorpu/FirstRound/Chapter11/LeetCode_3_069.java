package algo.tzashinorpu.FirstRound.Chapter11;

public class LeetCode_3_069 {
    public int mySqrt(int x) {
        // x 平方根的整数部分是满足 k^2 ≤x 的最大 k 值
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            // mid * mid 可能溢出
            if (x / mid > mid) {
                left = mid + 1;
            } else if (x / mid < mid) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
