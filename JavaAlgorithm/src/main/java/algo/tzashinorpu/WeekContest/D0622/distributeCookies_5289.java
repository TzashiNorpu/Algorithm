package algo.tzashinorpu.WeekContest.D0622;

public class distributeCookies_5289 {
    public int distributeCookies(int[] cookies, int k) {
        int min = 0, sum = 0;
        for (int num : cookies) {
            min = Math.max(min, num);
            sum += num;
        }
        int l = min, r = sum;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((sum + mid - 1) / mid > k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}
