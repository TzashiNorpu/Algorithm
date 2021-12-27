package algo.tzashinorpu.WeekContest.D1226;

public class E5963 {
    public boolean isSameAfterReversals(int num) {
        /*if (num == 0) {
            return true;
        }
        if (String.valueOf(num).endsWith("0")) {
            return false;
        }
        return true;*/
        return num == 0 || num % 10 == 0;
    }
}
