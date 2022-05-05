package algo.tzashinorpu.DpPlan.GSSY.Path;

import algo.tzashinorpu.DpPlan.GSSY.Package.coinChange_322;
import org.junit.jupiter.api.Test;

class coinChange_322Test {

    @Test
    void coinChange() {
        coinChange_322 ins = new coinChange_322();
        int amount = 0;
        int[] coins = {3};
        System.out.println(ins.coinChange1(coins, amount));
        System.out.println(ins.coinChange2(coins, amount));
    }
}