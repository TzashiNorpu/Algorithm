package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode_5_322 {

    // 栈溢出
    public int coinChangeBFS(int[] coins, int amount) {
        /*输入：coins = [1, 2, 5], amount = 11
        输出：3
        解释：11 = 5 + 5 + 1*/
        if (amount == 0) {
            return 0;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        stack.offer(amount);
        int level = 0;
        while (stack.size() > 0) {
            int size = stack.size();
            level++;
            for (int i = 0; i < size; i++) {
                Integer poll = stack.poll();
                for (int j = 0; j < coins.length; j++) {
                    int temp = poll - coins[j];
                    if (temp > 0) {
                        stack.offer(temp);
                    }
                    if (temp == 0) {
                        return level;
                    }
                }
            }
        }
        return -1;
    }

    private int step = Integer.MAX_VALUE;

    // 超时
    public int coinChangeDFS(int[] coins, int amount) {
        Arrays.sort(coins);
        trackback(0, coins, amount);
        return step == Integer.MAX_VALUE ? -1 : step;
    }

    private void trackback(int level, int[] coins, int amount) {
        if (amount == 0) {
            step = Math.min(level, step);
            return;
        }
        if (amount < 0) {
            return;
        }
        for (int i = 0; i < coins.length; i++) {
            trackback(level + 1, coins, amount - coins[i]);
        }
    }

    public int coinChangeMemDFS(int[] coins, int amount) {
        int[] mem = new int[amount + 1];
        Arrays.sort(coins);
        return memDFS(coins, amount, mem);
    }

    private int memDFS(int[] coins, int amount, int[] mem) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (mem[amount] != 0) {
            return mem[amount];
        }
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            /*int temp = 1 + memDFS(coins, amount - coins[i], mem);
            if (temp > 0 && temp < Integer.MAX_VALUE) {
                count = Math.min(count, temp);
            }*/
            // 上下两种方式都可以
            int temp = memDFS(coins, amount - coins[i], mem);
            if (temp >= 0 && temp < Integer.MAX_VALUE) {
                count = Math.min(count, temp + 1);
            }
        }
        mem[amount] = count == Integer.MAX_VALUE ? -1 : count;
        return mem[amount];
    }

    public int coinChangeBottomUp(int[] coins, int amount) {
        // [2,3]  6
        // [0,-1,1,2,2,2]
        // [1,9,10]  18
        // [0,1,2,3,4,5,6,7,8,1,1,2,3,4,5,6,7,8,2]
        int[] mem = new int[amount + 1];
        mem[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int min = -1;
            for (int j = 0; j < coins.length; j++) {
                // i == coins[j] : 只用一块
                // i > coins[j] 时 : 一块 + (i-coins[j])块 {i-coins[j] < 0 时总的为 -1}
                // i < coins[j] 时 : -1 块
                if (i == coins[j]) {
                    min = 1;
                    break;
                }
                if (i > coins[j]) {
                    int temp = mem[i - coins[j]] == -1 ? -1 : 1 + mem[i - coins[j]];
                    if (temp != -1) {
                        if (min == -1) {
                            min = temp;
                        } else {
                            min = Math.min(temp, min);
                        }
                    }
                }
            }
            mem[i] = min;
        }
        return mem[amount];
    }
}
