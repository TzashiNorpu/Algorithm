package algo.tzashinorpu.SpecialSubject.TopInterview1Round;

public class mySqrt_69 {
    public int mySqrt(int x) {
        long l = 0, r = x;
        while (l < r) {
            long mid = l + (r - l) / 2;
            if (
                //        x / mid == mid
                    mid * mid == x
            ) {
                return (int) mid;
            } else if (
//                    x / mid > mid
                    mid * mid < x
            ) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return (int) (l * l <= x ? l : l - 1);
    }
}

/*
while (low <= high) {
    long mid = low + (high - low) / 2;
    long r = mid * mid;
    if (r > x) high = mid - 1;
    else if (r < x) low = mid + 1;
    else return (int) mid;
}
    return (int) low - 1;
*/
/*
while (low < high) {
    long mid = low + (high - low) / 2;
    long r = mid * mid;
    if (r > x) high = mid;
    else if (r < x) low = mid + 1;
    else return (int) mid;
}
    return (int) low - 1;
*/
/*
while (low < high) {
    long mid = low + (high - low + 1) / 2;
    long r = mid * mid;
    if (r > x) high = mid - 1;
    else if (r < x) low = mid;
    else return (int) mid;
}
    return (int) low;
*/
