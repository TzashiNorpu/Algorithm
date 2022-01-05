package algo.tzashinorpu.SecondRound.Chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coinChange_322Test {

    @Test
    void coinChange() {
        coinChange_322 ins = new coinChange_322();
        int amount = 2;
        int[] coins = {3};
        System.out.println(ins.coinChangeDfs(coins, amount));
        System.out.println(ins.coinChangeDp1(coins, amount));
    }
}