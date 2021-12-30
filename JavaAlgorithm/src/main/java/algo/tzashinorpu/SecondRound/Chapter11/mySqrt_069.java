package algo.tzashinorpu.SecondRound.Chapter11;

public class mySqrt_069 {
    public int mySqrt1(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        // x 平方根的整数部分是满足 k^2 ≤x 的最大 k 值
        // 二分法的 while 循环推出条件是 l == r，因此二分法在每一次循环中必须要更新左边界或者右边界
        // 下图中循环每次进 r=mid-1分支是没有问题的->会更新 r ，从而更新 mid
        // 进 l = mid 分支时如果每次计算出来的 mid 都是一样的则会死循环
        // 这里的逻辑是因为循环体中 r>l 则每次 (r - l + 1) / 2 都会 > 1 可以更新 mid 的值
        int l = 0, r = x / 2;
        while (l <= r) {
            // l + r 可能溢出
            int mid = (l + r) / 2;
//            int mid = (l + r) / 2 + 1;
//            int mid = l + (r - l + 1) / 2;
            // mid * mid 可能溢出
            if (x / mid < mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    public int mySqrt2(int x) {
        int n = x / 2;
        if (n == 0) {
            return x;
        }
        while (x / n < n) {
            n--;
        }
        return n;
    }
}
