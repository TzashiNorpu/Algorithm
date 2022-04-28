package algo.tzashinorpu.DpPlan.GSSY.Path;

import org.junit.jupiter.api.Test;

class countRoutes_1575Test {

    @Test
    void countRoutes() {
        countRoutes_1575 ins = new countRoutes_1575();
        int[] locations = {1, 2, 3};
        int start = 0;
        int finish = 2;
        int fuel = 40;
        System.out.println(ins.countRoutes1(locations, start, finish, fuel));
        System.out.println(ins.countRoutes2(locations, start, finish, fuel));
    }
}