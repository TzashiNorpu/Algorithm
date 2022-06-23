package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class reverse_7 {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            int tmp = x % 10;
            res = res * 10 + tmp;
            x = x / 10;
        }
        return (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : (int) res;
    }
}
