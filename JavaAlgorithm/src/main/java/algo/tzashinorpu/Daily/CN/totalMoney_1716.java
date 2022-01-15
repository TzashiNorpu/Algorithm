package algo.tzashinorpu.Daily.CN;

public class totalMoney_1716 {
    public int totalMoney(int n) {
        int mod = n / 7;
        int remain = n % 7;
        // 28
        int res = mod >= 1 ? (28 * mod + (mod - 1) * mod * 7 / 2) : 0;
        int start = mod + 1;
        for (int i = 0; i < remain; i++) {
            res += start++;
        }
        return res;
    }
}
