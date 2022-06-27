package algo.tzashinorpu.WeekContest.D220625;

public class maximumXOR_2317 {
    public int maximumXOR(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res |= num;
        }
        return res;
    }
}
