package algo.tzashinorpu.WeekContest.D0116;

public class minMoves_5194 {
    public int minMoves(int target, int maxDoubles) {
        int step = 0;
        while (target != 1) {
            if (target % 2 != 0) {
                target--;
                step++;
            } else {
                if (maxDoubles > 0) {
                    target = target / 2;
                    maxDoubles--;
                    step++;
                } else {
                    return step + target - 1;
                }
            }
        }
        return step;
    }
}
