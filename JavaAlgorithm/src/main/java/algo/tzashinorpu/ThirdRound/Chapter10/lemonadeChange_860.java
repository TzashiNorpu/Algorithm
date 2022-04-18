package algo.tzashinorpu.ThirdRound.Chapter10;

public class lemonadeChange_860 {
    public boolean lemonadeChange(int[] bills) {
        int fiveCnt = 0;
        int tenCnt = 0;
        for (int bill : bills) {
            if (bill == 20) {
                int money = bill;
                if (tenCnt > 0) {
                    tenCnt--;
                    money = 10;
                }
                if (fiveCnt >= (money - 5) / 5) {
                    fiveCnt -= (money - 5) / 5;
                    money = 5;
                }
                if (money != 5) {
                    return false;
                }
            }
            if (bill == 10) {
                int money = bill;
                if (fiveCnt > 0) {
                    fiveCnt--;
                    tenCnt++;
                    money = 5;
                }
                if (money != 5) {
                    return false;
                }
            }
            if (bill == 5) {
                fiveCnt++;
            }
        }
        return true;
    }
}
