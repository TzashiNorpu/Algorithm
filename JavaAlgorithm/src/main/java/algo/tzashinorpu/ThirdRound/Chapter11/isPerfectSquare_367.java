package algo.tzashinorpu.ThirdRound.Chapter11;

public class isPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        /*long l = 0, r = num;
        long mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (mid * mid > num) {
                r = mid - 1;
            }
            if (mid * mid < num) {
                l = mid + 1;
            }
            if (mid * mid == num) return true;
        }
        return false;*/

       /* 1 = 1
        4 = 1 + 3
        9 = 1 + 3 + 5
        16 = 1 + 3 + 5 + 7
        25 = 1 + 3 + 5 + 7 + 9
        36 = 1 + 3 + 5 + 7 + 9 + 11
        ....
        so 1+3+...+(2n-1) = (2n-1 + 1)n/2 = n*n*/
        int k = 1;
        while (num > 0) {
            num -= k;
            k += 2;
        }
        return num == 0;
    }
}
