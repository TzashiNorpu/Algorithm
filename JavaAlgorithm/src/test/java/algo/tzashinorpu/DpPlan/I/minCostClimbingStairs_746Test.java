package algo.tzashinorpu.DpPlan.I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class minCostClimbingStairs_746Test {

    @Test
    void minCostClimbingStairs() {
        minCostClimbingStairs_746 ins = new minCostClimbingStairs_746();
        int[] cost1 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(ins.minCostClimbingStairs(cost1));

        int[] cost2 = {10, 15, 20};
        System.out.println(ins.minCostClimbingStairs(cost2));
    }
}