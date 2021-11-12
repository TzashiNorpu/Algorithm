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
        int step = memDFS(coins, amount, mem);
        return step == Integer.MAX_VALUE ? -1 : step;
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
            int temp = 1 + memDFS(coins, amount - coins[i], mem);
            if (temp > 0 && temp < Integer.MAX_VALUE) {
                count = Math.min(count, temp);
            }
        }
        mem[amount] = count;
        return mem[amount];
    }
}
