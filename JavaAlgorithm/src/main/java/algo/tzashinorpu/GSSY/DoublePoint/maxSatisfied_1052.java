package algo.tzashinorpu.GSSY.DoublePoint;

public class maxSatisfied_1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int res = 0;
        int len = customers.length;
        for (int i = 0; i < len; i++) {
            if (grumpy[i] == 0) {
                res += customers[i];
                customers[i] = 0;
            }
        }
        int temp = 0;
        int sum = 0;
        for (int i = 0, j = 0; j < len; j++) {
            sum += customers[j];
            if (j - i + 1 > minutes) sum -= customers[i++];
            temp = Math.max(temp, sum);
        }
        return res + temp;
    }
}
