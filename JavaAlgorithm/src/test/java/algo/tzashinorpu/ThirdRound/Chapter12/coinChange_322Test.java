package algo.tzashinorpu.ThirdRound.Chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coinChange_322Test {

    @Test
    void coinChange() {
        coinChange_322 ins = new coinChange_322();
        int amount = 11;
        int[] coins = {6, 7};
        System.out.println(ins.coinChange(coins, amount));
    }
}