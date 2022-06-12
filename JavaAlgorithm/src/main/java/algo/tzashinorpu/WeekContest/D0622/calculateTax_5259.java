package algo.tzashinorpu.WeekContest.D0622;

public class calculateTax_5259 {
    public double calculateTax(int[][] brackets, int income) {
        int len = brackets.length;
        int[] diff = new int[len];
        diff[0] = brackets[0][0];
        for (int i = 1; i < len; i++) {
            diff[i] = brackets[i][0] - brackets[i - 1][0];
        }
        int sum = 0;
        double res = 0;
        for (int i = 0; i < len; i++) {
            if (sum + diff[i] < income) {
                res += diff[i] * brackets[i][1] / 100.0;
            }
            if ((sum + diff[i]) >= income) {
                res += (income - sum) * brackets[i][1] / 100.0;
                break;
            }
            sum += diff[i];
        }
        return res;
    }
}
