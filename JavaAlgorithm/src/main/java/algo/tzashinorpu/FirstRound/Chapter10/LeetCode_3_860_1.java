package algo.tzashinorpu.FirstRound.Chapter10;

public class LeetCode_3_860_1 {
    public boolean lemonadeChange(int[] bills) {
        int fiveCnt = 0;
        int tenCnt = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveCnt++;
            } else if (bills[i] == 10) {
                tenCnt++;
                fiveCnt--;
                if (fiveCnt < 0) {
                    return false;
                }
            } else {
                int min = tenCnt > 0 ? 1 : 0;
                int temp = (bills[i] - 5) - min * 10;
                tenCnt -= min;
                fiveCnt -= temp / 5;
                if (fiveCnt < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
