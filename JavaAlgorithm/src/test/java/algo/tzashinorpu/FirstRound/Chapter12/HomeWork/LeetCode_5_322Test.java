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
        int amount = 4;
        LeetCode_5_322 instance = new LeetCode_5_322();
        System.out.println(instance.coinChangeDFS(coins, amount));
    }

    @Test
    void coinChangeMemDFS() {
        int[] coins = {2, 3, 4};
        int amount = 200;
        LeetCode_5_322 instance = new LeetCode_5_322();
        System.out.println(instance.coinChangeMemDFS(coins, amount));
    }

    @Test
    void coinChangeBottomUp() {
        int[] coins = {186, 419, 83, 408};
        int amount = 6249;
        LeetCode_5_322 instance = new LeetCode_5_322();
        System.out.println(instance.coinChangeBottomUp(coins, amount));
    }
}