package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

class LeetCode_5_322Test {

    @Test
    void coinChangeBFS() {
        int[] coins = {1, 2, 5};
        int amount = 100;
        LeetCode_5_322 instance = new LeetCode_5_322();
        System.out.println(instance.coinChangeBFS(coins, amount));
    }

    @Test
    void coinChangeDFS() {
        int[] coins = {2, 2};
        int amount = 3;
        LeetCode_5_322 instance = new LeetCode_5_322();
        System.out.println(instance.coinChangeDFS(coins, amount));
    }

    @Test
    void coinChangeMemDFS() {
        int[] coins = {1, 2, 3};
        int amount = 3;
        LeetCode_5_322 instance = new LeetCode_5_322();
        System.out.println(instance.coinChangeMemDFS(coins, amount));
    }
}