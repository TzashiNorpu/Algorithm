package algo.tzashinorpu.WeekContest.D0116;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mostPoints_5982Test {

    @Test
    void mostPoints() {
        mostPoints_5982 ins = new mostPoints_5982();
        int[][] questions1 = {{92, 1}, {5, 5}, {65, 3}};
        System.out.println(ins.mostPointsDfs(questions1));
        System.out.println(ins.mostPointsOrderedDp(questions1));
        System.out.println(ins.mostPointsReverseDp(questions1));
    }
}