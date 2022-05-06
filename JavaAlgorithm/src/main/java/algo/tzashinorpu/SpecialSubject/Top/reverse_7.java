package algo.tzashinorpu.SpecialSubject.Top;

public class reverse_7 {
    public int reverse(int x) {
        long res = 0;
        // 12345
        while (x != 0) {
            int tmp = x % 10;
            res = (res * 10) + tmp;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        return (int) res;
    }
}
