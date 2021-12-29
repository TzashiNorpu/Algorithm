package algo.tzashinorpu.SecondRound.Chapter10;

public class lemonadeChange_860 {
    public boolean lemonadeChange(int[] bills) {
        int[] ints = new int[3];
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                ints[0]++;
            }
            if (bills[i] == 10) {
                ints[0]--;
                if (ints[0] < 0) {
                    return false;
                }
                ints[1]++;
            }
            if (bills[i] == 20) {
                ints[2]++;
                // 5 5 5 10 10 5 5 20 20
                // case 1  找 10 + 5
                // greedy : 先找10块的
                ints[0] = ints[0] - 1;
                ints[1] = ints[1] - 1;
                if (ints[0] < 0 || ints[1] < 0) {
                    ints[0] = ints[0] + 1;
                    ints[1] = ints[1] + 1;
                } else {
                    ints[2]++;
                    continue;
                }
                // case 2 找 5+5+5
                ints[0] = ints[0] - 3;
                if (ints[0] < 0) {
                    ints[0] = ints[0] + 3;
                } else {
                    ints[2]++;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
