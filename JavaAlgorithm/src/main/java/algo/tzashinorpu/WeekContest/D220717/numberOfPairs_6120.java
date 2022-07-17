package algo.tzashinorpu.WeekContest.D220717;

public class numberOfPairs_6120 {
    public int[] numberOfPairs(int[] nums) {
        int[] ints = new int[110];
        for (var num : nums) ints[num]++;
        int count = 0, remain = 0;
        for (var num : ints) {
            count += num / 2;
            remain += num % 2;
        }
        return new int[]{count, remain};
    }
}
