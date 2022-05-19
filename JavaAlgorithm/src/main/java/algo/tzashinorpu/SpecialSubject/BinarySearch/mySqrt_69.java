package algo.tzashinorpu.SpecialSubject.BinarySearch;

public class mySqrt_69 {
    public int mySqrt_1(int x) {
        int l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid < x) l = mid + 1; // #1 更新后l左侧「必」小于x
            else if ((long) mid * mid > x) r = mid - 1; // #2 更新后r右侧「必」大于x
            else return mid;
        }
        return r;
    }

    public int mySqrt_2(int x) {
        // r = x+1
        int l = 0, r = x == Integer.MAX_VALUE ? x : x + 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid < x) l = mid + 1; // #1 更新后l左侧元素「必」小于x
            else if ((long) mid * mid > x) r = mid; // #2 更新后r及其右侧「必」大于x
            else return mid;
        }
        // l==r
        return r - 1;
    }
}
